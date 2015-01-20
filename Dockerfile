FROM clojure
MAINTAINER sorpa'as plat <me@sorpaas.com>

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY project.clj /usr/src/app/
RUN lein deps

ADD . /usr/src/app
CMD ["lein", "ring", "server-headless"]
