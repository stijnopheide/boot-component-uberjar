(defproject boot-component "0.1.0-LEININGEN"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                           [com.stuartsierra/component "0.2.3"]]
            :main boot-component.core
            :profiles {:uberjar {:aot :all}})
