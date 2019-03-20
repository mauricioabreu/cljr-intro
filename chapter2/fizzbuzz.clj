(defn fizzbuzz [number]
    (cond
        (and (= 0 (mod number 3)) (= 0 (mod number 5))) "fizzbuzz"
        (= 0 (mod number 3)) "fizz"
        (= 0 (mod number 5)) "buzz"
        :else number
    )
)

(println (fizzbuzz 1))
(println (fizzbuzz 3))
(println (fizzbuzz 5))
(println (fizzbuzz 15))