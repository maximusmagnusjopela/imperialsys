(ns imperialsys.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]
            [imperialsys.route :refer [imperial-routes]]
            [ring.adapter.jetty :refer [run-jetty]]))

(def cli-opts
  [["-p" "--port PORT" "Port number"
    :default 8080
    :parse-fn #(Integer/parseInt %)
    :validate [#(< 0 % 0x10000) "Must be a number between 0 and 65536"]]])

(defn -main
  "Imperial Information Systems Corporation iwebsite"
  [& args]
  (let [{:keys [options arguments summary errors]} (parse-opts args cli-opts)]
    (when errors
      (doseq [e errors]
        (println e))
      (println "Supported options:")
      (println summary)
      (System/exit -1))
    (let [{:keys [port]} options]
      (run-jetty imperial-routes {:port port}))))



