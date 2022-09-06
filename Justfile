test:
  clojure -Srepro -M:test -m kaocha.runner unit --no-randomize "$@"

run:
  clojure -M:run-m

uberjar:
  rm -f imdb-quest.jar
  clojure -T:build org.corfield.build/uber :uber-file '"imdb-quest.jar"'

docker-build TAG:
  docker build -t imdb-quest:{{TAG}} .
  docker tag imdb-quest:{{TAG}} imdb-quest:latest

docker-run:
  docker run -i --rm imdb-quest:latest
