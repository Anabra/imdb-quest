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

(defn between?
  "Inclusive range check"
  [scrutinee lo hi]
  (when scrutinee
   (and (<= lo scrutinee)
        (<= scrutinee hi))))

(defn calc-oscar-score-adjustment
  [num-oscar-wins]
  (cond
    (between? num-oscar-wins 1 2)  0.3
    (between? num-oscar-wins 3 5)  0.5
    (between? num-oscar-wins 6 10) 1
    (< 10 num-oscar-wins)          1.5
    :else                          0))

(defn assoc-oscar-score-adjustment
  [{:keys [num-oscar-wins] :as std-movie}]
  (assoc std-movie
         :oscar-score-adjustment
         (calc-oscar-score-adjustment num-oscar-wins)))

(defn assoc-oscar-score-adjustments
  [std-movies]
  (map assoc-oscar-score-adjustment std-movies))

(defn adjust-scores
  [std-movies]
  (->> std-movies
       assoc-review-score-adjustments
       assoc-oscar-score-adjustments
       (map (fn [{:keys [imdb-rating
                         review-score-adjustment
                         oscar-score-adjustment]
                  :as std-movie}]
              (assoc std-movie
                     :adjusted-imdb-rating
                     (->> [imdb-rating review-score-adjustment oscar-score-adjustment]
                          (map rationalize)
                          (apply +)
                          double))))))
