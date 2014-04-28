(ns rpslp.routes.home
  (:use compojure.core)
  (:require [rpslp.views.layout :as layout]
            [rpslp.game :as game]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn game-page []
  (layout/render "game.html"))

(defn game-result-page [action]
  (let [computer-pick (game/get-computer-pick)]
    (layout/render "game.html"
    {:result (game/get-winner action computer-pick)
     :action action 
     :computer-pick computer-pick}
    )))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/game" [] (game-page))
  (POST "/game" [action] (game-result-page action))
)
