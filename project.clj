(defproject cloudpassage-lib "0.1.0-SNAPSHOT"
  :description "A library for interacting with cloudpassage apis."
  :url "http://github.com/RackSec/cloudpassage-lib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.taoensso/timbre "4.2.0"]
                 [manifold "0.1.2"]
                 [aleph "0.4.1-beta2"]
                 [clj-time "0.11.0"]
                 [base64-clj "0.1.1"]
                 [cheshire "5.5.0"]
                 [com.cemerick/url "0.1.1"]]
  :plugins [[lein-auto "0.1.2"]
            [lein-cljfmt "0.3.0"]
            [lein-pprint "1.1.1"]
            [lein-cloverage "1.0.7-SNAPSHOT"]]
  :min-lein-version "2.0.0"
  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.7.1"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}})
