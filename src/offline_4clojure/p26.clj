;; Fibonacci Sequence - Easy
;; Write a function which returns the first X fibonacci numbers.
;; tags - Fibonacci:seqs
;; restricted -
(ns offline-4clojure.p26
  (:use clojure.test))

(def __
  (fn [n]
    (take n
          ((fn fib-rec [a b]
             (cons a (lazy-seq (fib-rec b (+ a b))))) 1 1)))
)

(defn -main []
  (are [soln] soln
(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))
))
