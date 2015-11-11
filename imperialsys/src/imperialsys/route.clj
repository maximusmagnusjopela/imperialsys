(ns imperialsys.route
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes imperial-routes
  (GET "/" [] "index")
  (context "/services" []
    (GET "/" [] "services")
    (GET "/consulting" [] "services/consulting")
    (GET "/ml" [] "services/ml"))
  (context "/products" []
    (GET "/" [] "products")
    (GET "/novown" [] "products/novown")
    (GET "/datalinkapi" [] "products/datalinkapi"))
  (context "/products" []
    (GET "/" [] "products")
    (GET "/novown" [] "products/novown")
    (GET "/datalinkapi" [] "products/datalinkapi"))A
  (route/not-found "404 - not found"))

