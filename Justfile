test:
  clojure -Srepro -M:test -m kaocha.runner unit --no-randomize "$@"

uberjar:
  rm -f imdb-quest.jar
  clojure -T:build org.corfield.build/uber :uber-file '"imdb-quest.jar"'
  
docker-build TAG: uberjar
  docker build -t imdb-quest:{{TAG}} .
  docker tag imdb-quest:{{TAG}} imdb-quest:latest

run:
  docker run -i --rm imdb-quest:latest
