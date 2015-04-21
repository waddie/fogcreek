(ns fogcreek.core-test
  (:require [clojure.test :refer :all]
            [fogcreek.core :refer :all]))

(deftest test-supplied-example
  (testing "fog-hash"
    (is (= (fog-hash "leepadg") 680131659347) "Supplied example for hashing algorithm."))
  (testing "find-needle"
    (is (= (find-needle 680131659347 7) "leepadg") "Search for known example of 7 letter string.")))
