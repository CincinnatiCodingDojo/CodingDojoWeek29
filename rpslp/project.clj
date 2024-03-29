(defproject rpslp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [lib-noir "0.8.1"]
                 [compojure "1.1.6"]
                 [ring-server "0.3.1"]
                 [selmer "0.6.4"]
                 [com.taoensso/timbre "3.1.6"]
                 [com.taoensso/tower "2.0.2"]
                 [markdown-clj "0.9.41"]
                 [environ "0.4.0"]]

  :repl-options {:init-ns rpslp.repl}
  :plugins [[lein-ring "0.8.10"]
            [lein-environ "0.4.0"]]
  :ring {:handler rpslp.handler/app
         :init    rpslp.handler/init
         :destroy rpslp.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.2.2"]
                        [midje "1.6.0"]]
         :env {:dev true}}}
  :min-lein-version "2.0.0")