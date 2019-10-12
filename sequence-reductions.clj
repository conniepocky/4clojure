(fn my-reductions
  ([f xs] (my-reductions f (first xs) (rest xs)))
  ([f acc xs]
   (lazy-seq 
     (if (empty? xs)
       (list acc)
       (cons acc (my-reductions f (f acc (first xs)) (rest xs)))))))
