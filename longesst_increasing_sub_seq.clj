(fn [coll]
  (let [a (partition-by #(apply < %) (partition 2 1 coll))
        b (filter (fn [[[x1 x2]]] (< x1 x2)) a)
        c (first (sort-by count > b))]
    (concat (first c) (map last (rest c)))))
