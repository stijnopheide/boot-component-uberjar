#!/usr/bin/env boot

(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojure "1.7.0-alpha4"]
                  [com.stuartsierra/component "0.2.3"]])

(deftask build
         "Builds an uberjar of this project that can be run with java -jar"
         []
         (comp
           (aot :all true)
           (pom :project 'boot-component
                :version "0.1.0-BOOT")
           (uber)
           (jar :main 'boot-component.core)))
