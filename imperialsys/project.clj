(defproject imperialsys "0.1.1"
  :description "Imperial Systems Corporation's website"
  :url "https://github.com/maximusmagnusjopela/imperialsys"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 [org.clojure/tools.cli "0.3.3"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot imperialsys.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
