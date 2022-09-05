(ns anabra.imdb-quest.rescorer-test
  (:require [anabra.imdb-quest.rescorer :as sut]
            [anabra.imdb-quest.test-data :as test-data]
            [clojure.template :refer [do-template]]
            [same.core :as same]
            [clojure.test :as t]))

;; NOTE: we could add a property-based test here (result always <= original score)
;; https://github.com/clojure/test.check
(t/deftest penalize-review-score
  (do-template
   [title max-review-count review-count review-score expected]
   (t/testing title
     (let [actual (sut/penalize-review-score max-review-count review-count review-score)]
       (t/is (same/ish? expected actual))))

   "same review count"
   300001 300001 3.7
   3.7

   "diff < 100k"
   300001 200002 3.7
   3.7

   "diff == 100k"
   300001 200001 3.7
   3.6

   "100k < diff < 200k"
   300001 200000 3.7
   3.6

   "200k < diff < 300k"
   300001 100000 3.7
   3.5

   "max review count < 100k"
   13 4 3.7
   3.7))

(t/deftest assoc-penalized-review-score
  (do-template
   [title max-review-count std-movie expected]
   (t/testing title
     (let [actual (sut/assoc-penalized-review-score max-review-count std-movie)]
       (t/is (same/ish? expected actual))))

   "adds penalized score and keeps all other fields"
   300001 {:imdb-rating-count 200000
           :imdb-rating      3.7
           :id               "foobar"
           :some-other-field "asdqwe"}
   {:imdb-rating-count     200000
    :imdb-rating           3.7
    :penalized-imdb-rating 3.6
    :id                    "foobar"
    :some-other-field      "asdqwe"}))

(t/deftest penalize-review-scores
  (do-template
   [title std-movies expected]
   (t/testing title
     (let [actual (sut/penalize-review-scores std-movies)]
       (t/is (same/ish? expected actual))))

   "first movie has the max number of reviews"
   (take 3 test-data/top-10-std-movies-with-awards)
   [{:rank 1
     :title "The Shawshank Redemption"
     :id "tt0111161"
     :imdb-rating-count 2635178
     :imdb-rating 9.2
     :penalized-imdb-rating 9.2
     :num-oscar-wins 0}
    {:rank 2
     :title "The Godfather"
     :id "tt0068646"
     :imdb-rating-count 1826349
     :imdb-rating 9.2
     :penalized-imdb-rating 8.4
     :num-oscar-wins 3}
    {:rank 3
     :title "The Dark Knight"
     :id "tt0468569"
     :imdb-rating-count 2606377
     :imdb-rating 9.0
     :penalized-imdb-rating 9.0
     :num-oscar-wins 2}]))
