(ns anabra.imdb-quest
  (:require
   [anabra.imdb-quest.scraper :as scraper]
   [anabra.imdb-quest.rescorer :as rescorer]
   [clojure.data.json :as json]))

(defn -main
  [& _args]
  (let [movies (scraper/get-movies-with-awards! 20)
        reranked-movies (rescorer/rerank-movies movies)]
    (-> reranked-movies
        (json/write *out* {:indent true}))))
