(defproject fogcreek "1.0.0"
  :description "Fog Creek Software Developer Question"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot fogcreek.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
