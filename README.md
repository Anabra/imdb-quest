# imdb-quest

## What does this do?

This script fetches movie data from the IMDM Top250Movies list, and adjusts the scores of the films based on some arbitrary criteria.

### Review penalizer

Finds the film with the maximum number of reviews (out of the TOP 20 only). This is going to be the benchmark. 
Compares every movie’s number of reviews to this and penalizes each of them based on the following rule: 
Every 100k deviation from the maximum translates to a point deduction of 0.1. 

### Oscar calculator

It gives a few extra points to a film based on the number of Oscars it won:

- 1 or 2 oscars → 0.3 point
- 3 or 5 oscars → 0.5 point
- 6 - 10 oscars → 1 point
- 10+ oscars → 1.5 point

## How does it work?

It fetches data from a public API: https://imdb-api.com/. 
All information required for the task is available here, so no manual scraping was necessary.

The app uses the following endpoints:
* `Top250Movies`
* `Awards`

The API requires an API key. For the ease of reviewing, the app uses my personal API key.
This is a free API key, and it might run out of its quota after a few runs.

## What do I need to run this?

The only dependency you need is Docker.

Alternatively, if you have `just` and `clojure` installed, you can run the app without a container.

* `just`: https://github.com/casey/just
* `clojure`: https://clojure.org/guides/install_clojure

## How do I run this?

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

## Notes

This repository depends on one of my other libraries https://github.com/Anabra/gavle. It is a work-in-progress library written for learning purposes, and to add some extra functionality to https://github.com/dakrone/clj-http. Nothing too fancy, just some retry logic and logging.
