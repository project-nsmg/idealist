(ns idealist.routes.home
  (:require [compojure.core :refer :all]
            [idealist.layout :as layout]
            [idealist.util :as util]
            [idealist.db.core :as db]))

(defn list-ideas []
  (layout/render
    "home.html" {:ideas (db/all-ideas)}))

(defn save-ideas [description]
  (cond (empty? description) (list-ideas)
        :else (do
                (db/create-idea {:description description})
                (list-ideas))))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (list-ideas))
  (POST "/" [description] (save-ideas description))
  (GET "/about" [] (about-page)))
