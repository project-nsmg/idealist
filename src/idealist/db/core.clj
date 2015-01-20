(ns idealist.db.core
    (:require [monger.core :as mg]
              [monger.collection :as mc]
              [monger.operators :refer :all]))

;; Tries to get the Mongo URI from the environment variable
;; MONGOHQ_URL, otherwise default it to localhost
(defonce db (let [uri (get (System/getenv) "MONGOHQ_URL" "mongodb://db/idealist")
                  {:keys [conn db]} (mg/connect-via-uri uri)]
              db))

(defn create-user [user]
  (mc/insert db "users" user))

(defn update-user [id first-name last-name email]
  (mc/update db "users" {:id id}
             {$set {:first_name first-name
                    :last_name last-name
                    :email email}}))

(defn get-user [id]
  (mc/find-one-as-map db "users" {:id id}))

(defn create-idea [idea]
  (mc/insert db "ideas" idea))

(defn update-idea [id description]
  (mc/update db "ideas" {:id id}
             {$set {:content description}}))

(defn get-idea [id]
  (mc/find-one-as-map db "ideas" {:id id}))

(defn all-ideas []
  (mc/find-maps db "ideas"))
