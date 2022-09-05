(ns anabra.imdb-quest.rescorer)

(defn penalize-review-score
  [max-review-count review-count review-score]
  (let [diff-100ks (quot (- max-review-count review-count) 100000)
        deduction  (* diff-100ks 0.1)]
    (double (- (rationalize review-score) (rationalize deduction)))))

(defn assoc-penalized-review-score
  [max-review-count {:keys [imdb-rating imdb-rating-count] :as std-movie}]
  (assoc std-movie
         :penalized-imdb-rating
         (penalize-review-score max-review-count imdb-rating-count imdb-rating)))

(defn penalize-review-scores
  [std-movies]
  (let [max-review-count (->> std-movies (map :imdb-rating-count) (apply max))]
    (map #(assoc-penalized-review-score max-review-count %) std-movies)))

