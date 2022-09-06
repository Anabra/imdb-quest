FROM clojure:temurin-11-tools-deps

COPY imdb-quest.jar imdb-quest.jar

CMD ["sh", "-c", \
    "exec java -cp imdb-quest.jar clojure.main --report stderr -m anabra.imdb-quest"]
