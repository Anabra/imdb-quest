(ns anabra.imdb-quest.scraper-test
  (:require [anabra.imdb-quest.scraper :as sut]
            [vcr-clj.clj-http :refer [with-cassette]]
            [clojure.test :as t]))

(t/deftest assoc-oscars!
  (with-cassette :assoc-oscars
    (t/testing "assocs number of oscar wins"
      (let [godfather {:rank 2
                       :title "The Godfather"
                       :id "tt0068646"
                       :imdb-rating-count 1824997
                       :imdb-rating 9.2}
            actual (sut/assoc-oscars! godfather)
            expected {:rank 2
                      :title "The Godfather"
                      :id "tt0068646"
                      :imdb-rating-count 1824997
                      :imdb-rating 9.2
                      :num-oscar-wins 3}]
        (t/is expected actual)))))

(t/deftest get-movies-with-awards!
  (with-cassette :get-movies-with-awards
    (t/testing "succesfully transforms the top 3 movies"
      (let [actual (sut/get-movies-with-awards! 3)
            expected [{:rank 1
                       :title "The Shawshank Redemption"
                       :id "tt0111161"
                       :imdb-rating-count 2635670
                       :imdb-rating 9.2
                       :num-oscar-wins 0}
                      {:rank 2
                       :title "The Godfather"
                       :id "tt0068646"
                       :imdb-rating-count 1826708
                       :imdb-rating 9.2
                       :num-oscar-wins 3}
                      {:rank 3
                       :title "The Dark Knight"
                       :id "tt0468569"
                       :imdb-rating-count 2606895
                       :imdb-rating 9.0
                       :num-oscar-wins 2}]]
        (t/is (= expected actual))))))
