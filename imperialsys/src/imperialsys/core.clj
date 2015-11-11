(ns imperialsys.core
  (:gen-class)
  (:require [clojure.tools.cli :refer [parse-opts]]))

(def cli-opts
  [["-p" "--port PORT" "Port number"
    :default 80
    :parse-fn #(Integer/parseInt %)
    :validate [#(< 0 % 0x10000) "Must be a number between 0 and 65536"]]])

(defn -main
  "Imperial Information Systems Corporation iwebsite"
  [& args]
  (let [{:keys [options arguments summary errors]} (parse-opts args cli-opts)]
    (println options)))

