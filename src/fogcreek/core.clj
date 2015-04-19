(ns fogcreek.core
  (:gen-class)
  (:require [clojure.set :as set]))

(def letters "Valid letters for Fog Creek hashing."
  "acdegilmnoprstuw")

(def letter-map "A hash map of valid letters to their index."
  (set/map-invert (map-indexed vector letters)))

(defn fog-hash
  "Returns the Fog Creek hash of a string s."
  [s]
  {:pre [(string? s)
         (every? #(contains? letter-map %) (seq s))]}
  (reduce #(+' (*' % 37) (letter-map %2)) 7 (seq s)))

(defn find-needle
  "Find the string of length word-length that when Fog Creek
  hashed produces the hash needle."
  [needle word-length]
  {:pre [(number? needle)
         (number? word-length)]}
  (loop [r word-length
         w ""]
    (if (= r 0)
      w
      (recur (dec r)
             (str w
                  (last (last
                    (filter
                      #(<= (first %) needle)
                        (map
                          #(vector (fog-hash (str w % (apply str (repeat (dec r) (first letters))))) %)
                            (seq letters))))))))))
                            
(defn -main
  "Find the 9 letter string that when Fog Creek hashed produces 945924806726376."
  [& args]
  (println (find-needle 945924806726376 9)))
