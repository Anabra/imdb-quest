(ns anabra.imdb-quest.client
  (:require
   [gavle.client :as g]
   [anabra.imdb-quest.test-data :as test-data]
   [clojure.set :as set]
   [clojure.edn :as edn]))

(defn raw-top-movie->standarized-top-movie
  [raw-top-movie]
  (-> raw-top-movie
      (select-keys
       [:imDbRatingCount
        :rank
        :imDbRating
        :title
        :id])
      (set/rename-keys
       {:imDbRatingCount :imdb-rating-count
        :imDbRating      :imdb-rating})
      (update :imdb-rating       edn/read-string)
      (update :imdb-rating-count edn/read-string)
      (update :rank              edn/read-string)))

(defn standardize-award-outcome
  [{:keys [outcomeTitle outcomeCategory outcomeDetails]}]
  {:oscar?  (boolean (re-matches #"(?i)oscar"  outcomeCategory))
   :winner? (boolean (re-matches #"(?i)winner" outcomeTitle))
   :count   (count outcomeDetails)})

(defn event->award-outcomes
  [{:keys [outcomeItems]}]
  (map standardize-award-outcome outcomeItems))

(defn events->aggregated-award-outcomes
  [events]
  (transduce
   (mapcat event->award-outcomes)
   (completing
    (fn [agg-award-outcomes {:keys [count] :as cur-award-outcome}]
      (let [award-classification (select-keys cur-award-outcome [:oscar? :winner?])]
        (update agg-award-outcomes award-classification #(+ % count)))))
   {{:oscar? true  :winner? true}  0
    {:oscar? true  :winner? false} 0
    {:oscar? false :winner? true}  0
    {:oscar? false :winner? false} 0}
   events))

(defn get-top-250-movies!
  []
  (->> (g/retry-get-with-handlers!
        "https://imdb-api.com/en/API/Top250Movies/k_t627mlm8"
        {}
        {:default g/log-non-200-error})
       (:items)
       (map raw-top-movie->standarized-top-movie)))

(defn get-awards!
  [imdb-id]
  (g/retry-get-with-handlers!
   (str "https://imdb-api.com/en/API/Awards/k_t627mlm8/" imdb-id)
   {}
   {:default g/log-non-200-error}))


(comment

  (def std-top-100-movies
    (->> test-data/top-250-movies
         (:items)
         (map raw-top-movie->standarized-top-movie)
         (filter #(<= (:rank %) 100))))

  (events->aggregated-award-outcomes (:items test-data/godfather-awards))

  "")
