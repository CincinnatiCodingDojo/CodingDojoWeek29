(ns rpslp.routes.home
  (:use compojure.core)
  (:require [rpslp.views.layout :as layout]
            [rpslp.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn game-page []
  (layout/render "game.html"))
(defn game-result[choice]
	(layout/render "game.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/game" [] (game-page))
  (POST "/game" [choice] (game-result choice))
)
