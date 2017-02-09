(ns cojbu.core
  (require [clj-http.client :as client]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(client/head "http://www.index.hr/")

(client/post "http://site.com/api"
  {:basic-auth ["user" "pass"]
   :body "{\"json\": \"input\"}"
   :headers {"X-Api-Version" "2"}
   :content-type :json
   :socket-timeout 1000  ;; in milliseconds
   :conn-timeout 1000    ;; in milliseconds
   :accept :json})

(client/get "http://www.index.hr/")
