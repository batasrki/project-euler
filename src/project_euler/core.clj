(ns project-euler.core)

(def of-3s (range 0 1000 3))
(def of-5s (range 0 1000 5))
(def combined (distinct (concat of-3s of-5s)))
(reduce + combined)

(defn lazy-seq-fibo
([]
(concat [0 1] (lazy-seq-fibo 0N 1N)))
([a b]
(let [n (+ a b)]
(lazy-seq
(cons n (lazy-seq-fibo b n))))))

(take 12 (lazy-seq-fibo))
