(ns imperialsys.core
  (:gen-class)
  (:require [hiccup.core :refer :all]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn base
  [title & content]
  [:html
   [:head
    [:title title]]
   [:body content]])

(defn nav-bar
  [items]
  [:ul (for [i items] [:li i])])

(defn article
  [{:keys [title author txt]}]
  [:div {:class "article"} 
   [:h1 title]
   [:p txt]
   [:p author]])

(defn footer
  [items]
  [:footer
   [:ul
    (for [i items] [:li i])]])

(base "hello world" 
      (nav-bar ["nav1" "nav2"])
      (article {:title "an oath of faith"
                :txt "I am taking my oath of faith with clojure !"
                :author "Jonathan Pelletier the great"})
      (footer ["hello1" "hello2" "hello3"]))
      

