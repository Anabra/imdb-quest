(ns anabra.imdb-quest.scraper-test
  (:require [anabra.imdb-quest.scraper :as sut]
            [anabra.imdb-quest.test-data :as test-data]
            [clojure.template :refer [do-template]]
            [vcr-clj.clj-http :refer [with-cassette]]
            [clojure.test :as t]))

(t/deftest raw-top-movie->std-top-movie
  (do-template
   [title raw-top-movie expected]
   (t/testing title
     (let [actual (sut/raw-top-movie->std-top-movie raw-top-movie)]
       (t/is (= expected actual))))

   "god-father top movie standardization"
   {:imDbRatingCount "1824997"
    :rank            "2"
    :crew            "Francis Ford Coppola (dir.) Marlon Brando Al Pacino"
    :imDbRating      "9.2"
    :title           "The Godfather"
    :year            "1972"
    :id              "tt0068646"
    :image
    "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR012128176_AL_.jpg"
    :fullTitle       "The Godfather (1972)"}
   {:rank              2
    :title             "The Godfather"
    :id                "tt0068646"
    :imdb-rating-count 1824997
    :imdb-rating       9.2}))

(t/deftest raw-award-outcome->std-award-outcome
  (do-template
   [title raw-award-outcome expected]
   (t/testing title
     (let [actual (sut/raw-award-outcome->std-award-outcome raw-award-outcome)]
       (t/is (= expected actual))))

   "oscar win"
   (-> test-data/godfather-awards :items (nth 0) :outcomeItems (nth 0))
   {:oscar? true :winner? true :count 3}

   "oscar nomination"
   (-> test-data/godfather-awards :items (nth 0) :outcomeItems (nth 1))
   {:oscar? true :winner? false :count 8}

   "non-oscar win"
   (-> test-data/godfather-awards :items (nth 1) :outcomeItems (nth 0))
   {:oscar? false :winner? true :count 1}

   "non-oscar nominationn"
   (-> test-data/godfather-awards :items (nth 1) :outcomeItems (nth 1))
   {:oscar? false :winner? false :count 4}))

(t/deftest events->aggregated-award-outcomes
  (do-template
   [title raw-award-events expected]
   (t/testing title
     (let [actual (sut/events->aggregated-award-outcomes raw-award-events)]
       (t/is (= expected actual))))

   "film with oscar wins"
   (:items test-data/godfather-awards)
   {{:oscar? true :winner? true}   3
    {:oscar? true :winner? false}  8
    {:oscar? false :winner? true}  28
    {:oscar? false :winner? false} 22}

   "film without oscar wins"
   (:items test-data/shawshank-awards)
   {{:oscar? false :winner? false} 36
    {:oscar? false :winner? true}  21
    {:oscar? true :winner? false}  7
    {:oscar? true :winner? true}   0}))

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
