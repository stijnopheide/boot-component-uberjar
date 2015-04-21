(ns boot-component.core
  (:require [com.stuartsierra.component :as component])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defrecord SomeComponent []
  component/Lifecycle
  (start [this]
    (println "started"))
  (stop [this]
    (println "stopped")))

(defn -main [& args]
  (component/start (component/system-map :some-component (->SomeComponent))))
