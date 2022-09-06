(ns anabra.imdb-quest.rescorer-test
  (:require [anabra.imdb-quest.rescorer :as sut]
            [anabra.imdb-quest.test-data :as test-data]
            [clojure.template :refer [do-template]]
            [same.core :as same]
            [clojure.test :as t]))

;; NOTE: we could add a property-based test here (result is always non-positive)
;; https://github.com/clojure/test.check
(t/deftest calc-review-score-adjustment
  (do-template
   [title max-review-count review-count expected]
   (t/testing title
     (let [actual (sut/calc-review-score-adjustment max-review-count review-count)]
       (t/is (same/ish? expected actual))))

   "same review count"
   300001 300001
   0

   "diff < 100k"
   300001 200002
   0

   "diff == 100k"
   300001 200001
   (- 0.1)

   "100k < diff < 200k"
   300001 200000
   (- 0.1)

   "200k < diff < 300k"
   300001 100000
   (- 0.2)

   "max review count < 100k"
   13 4
   0))

(t/deftest assoc-review-score-adjustment
  (do-template
   [title max-review-count std-movie expected]
   (t/testing title
     (let [actual (sut/assoc-review-score-adjustment max-review-count std-movie)]
       (t/is (same/ish? expected actual))))

   "adds review score adjustment and keeps all other fields"
   300001 {:imdb-rating-count 200000
           :imdb-rating      3.7
           :id               "foobar"
           :some-other-field "asdqwe"}
   {:imdb-rating-count       200000
    :imdb-rating             3.7
    :review-score-adjustment (- 0.1)
    :id                      "foobar"
    :some-other-field        "asdqwe"}))

(t/deftest assoc-review-score-adjustments
  (do-template
   [title std-movies expected]
   (t/testing title
     (let [actual (sut/assoc-review-score-adjustments std-movies)]
       (t/is (same/ish? expected actual))))

   "first movie has the max number of reviews"
   (take 3 test-data/top-10-std-movies-with-awards)
   [{:rank 1
     :title "The Shawshank Redemption"
     :id "tt0111161"
     :imdb-rating-count 2635178
     :imdb-rating 9.2
     :review-score-adjustment 0
     :num-oscar-wins 0}
    {:rank 2
     :title "The Godfather"
     :id "tt0068646"
     :imdb-rating-count 1826349
     :imdb-rating 9.2
     :review-score-adjustment (- 0.8)
     :num-oscar-wins 3}
    {:rank 3
     :title "The Dark Knight"
     :id "tt0468569"
     :imdb-rating-count 2606377
     :imdb-rating 9.0
     :review-score-adjustment 0
     :num-oscar-wins 2}]))

(t/deftest calc-oscar-score-adjustment
  (do-template
   [num-oscar-wins expected]
   (t/testing (str num-oscar-wins " oscars")
     (let [actual (sut/calc-oscar-score-adjustment num-oscar-wins)]
       (t/is (same/ish? expected actual))))

   (- 1) 0
   0     0
   1     0.3
   2     0.3
   3     0.5
   4     0.5
   5     0.5
   6     1
   8     1
   10    1
   11    1.5
   13    1.5))

(t/deftest assoc-oscar-score-adjustment
  (do-template
   [title std-movie expected]
   (t/testing title
     (let [actual (sut/assoc-oscar-score-adjustment std-movie)]
       (t/is (same/ish? expected actual))))

   "adds oscar score adjustment and keeps all other fields"
   {:imdb-rating-count 200000
    :imdb-rating       3.7
    :id                "foobar"
    :some-other-field  "asdqwe"
    :num-oscar-wins    3}
   {:imdb-rating-count       200000
    :imdb-rating             3.7
    :oscar-score-adjustment  0.5
    :id                      "foobar"
    :some-other-field        "asdqwe"
    :num-oscar-wins          3}))

(t/deftest assoc-oscar-score-adjustments
  (do-template
   [title std-movies expected]
   (t/testing title
     (let [actual (sut/assoc-oscar-score-adjustments std-movies)]
       (t/is (same/ish? expected actual))))

   "assocs oscar score adjustments to each movie"
   (take 3 test-data/top-10-std-movies-with-awards)
   [{:rank 1
     :title "The Shawshank Redemption"
     :id "tt0111161"
     :imdb-rating-count 2635178
     :imdb-rating 9.2
     :num-oscar-wins 0
     :oscar-score-adjustment 0}
    {:rank 2
     :title "The Godfather"
     :id "tt0068646"
     :imdb-rating-count 1826349
     :imdb-rating 9.2
     :num-oscar-wins 3
     :oscar-score-adjustment 0.5}
    {:rank 3
     :title "The Dark Knight"
     :id "tt0468569"
     :imdb-rating-count 2606377
     :imdb-rating 9.0
     :num-oscar-wins 2
     :oscar-score-adjustment 0.3}]))

(t/deftest adjust-scores
  (do-template
   [title std-movies expected]
   (t/testing title
     (let [actual (sut/adjust-scores std-movies)]
       (t/is (same/ish? expected actual))))

   "assocs adjusted scores to each movie"
   (take 3 test-data/top-10-std-movies-with-awards)
   [{:rank 1
     :title "The Shawshank Redemption"
     :id "tt0111161"
     :imdb-rating-count 2635178
     :imdb-rating 9.2
     :review-score-adjustment 0
     :num-oscar-wins 0
     :oscar-score-adjustment 0
     :adjusted-imdb-rating 9.2}
    {:rank 2
     :title "The Godfather"
     :id "tt0068646"
     :imdb-rating-count 1826349
     :imdb-rating 9.2
     :review-score-adjustment (- 0.8)
     :num-oscar-wins 3
     :oscar-score-adjustment 0.5
     :adjusted-imdb-rating 8.9}
    {:rank 3
     :title "The Dark Knight"
     :id "tt0468569"
     :imdb-rating-count 2606377
     :imdb-rating 9.0
     :review-score-adjustment 0
     :num-oscar-wins 2
     :oscar-score-adjustment 0.3
     :adjusted-imdb-rating 9.3}]))

(t/deftest rerank-movies
  (do-template
   [title std-movies expected]
   (t/testing title
     (let [actual (sut/rerank-movies std-movies)]
       (t/is (same/ish? expected actual))))

   "assocs adjusted scores to each movie"
   (take 3 test-data/top-10-std-movies-with-awards)
   [{:adjusted-rank 1
     :rank 3
     :title "The Dark Knight"
     :id "tt0468569"
     :imdb-rating-count 2606377
     :imdb-rating 9.0
     :review-score-adjustment 0
     :num-oscar-wins 2
     :oscar-score-adjustment 0.3
     :adjusted-imdb-rating 9.3}
    {:adjusted-rank 2
     :rank 1
     :title "The Shawshank Redemption"
     :id "tt0111161"
     :imdb-rating-count 2635178
     :imdb-rating 9.2
     :review-score-adjustment 0
     :num-oscar-wins 0
     :oscar-score-adjustment 0
     :adjusted-imdb-rating 9.2}
    {:adjusted-rank 3
     :rank 2
     :title "The Godfather"
     :id "tt0068646"
     :imdb-rating-count 1826349
     :imdb-rating 9.2
     :review-score-adjustment (- 0.8)
     :num-oscar-wins 3
     :oscar-score-adjustment 0.5
     :adjusted-imdb-rating 8.9}]))
