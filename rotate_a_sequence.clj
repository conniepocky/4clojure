(fn [rotate-by collection]
  (let [size     (count collection)
        distance (mod rotate-by size)]
    (drop distance
          (take (+ distance size) (cycle collection)))))
