(ns anabra.imdb-quest.rescorer)

(defn calc-review-score-adjustment
  [max-review-count review-count]
  (let [diff-100ks (quot (- max-review-count review-count) 100000)]
    (- (* diff-100ks 0.1))))

(defn assoc-review-score-adjustment
  [max-review-count {:keys [imdb-rating-count] :as std-movie}]
  (assoc std-movie
         :review-score-adjustment
         (calc-review-score-adjustment max-review-count imdb-rating-count)))

(defn assoc-review-score-adjustments
  [std-movies]
  (let [max-review-count (->> std-movies (map :imdb-rating-count) (apply max))]
    (map #(assoc-review-score-adjustment max-review-count %) std-movies)))

