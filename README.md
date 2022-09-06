# imdb-quest

## Installation

The only dependency you need is Docker.


Alternatively, if you have `just` and `clojure` installed, you can run the app without a container.

* `just`: https://github.com/casey/just
* `clojure`: https://clojure.org/guides/install_clojure


## Usage

### With `Docker`

Building the docker image:
```
docker build -t imdb-quest:0.1.0 .
docker tag imdb-quest:0.1.0 imdb-quest:latest
```

Running the container 
```
docker run -i --rm imdb-quest:latest
```

### With `clojure` and `just`

Running tests:
```
just test
```

Running the app:
```
just run
```
