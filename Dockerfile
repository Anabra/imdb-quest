FROM clojure:temurin-11-tools-deps

COPY . imdb-quest
WORKDIR imdb-quest

CMD ["sh", "-c", \
    "exec clojure -M:run-m"]
