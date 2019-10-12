((fn [value collection]
  (loop [current-collection collection
         new-collection []]
    (if (< 1 (count current-collection))
      (recur (rest current-collection)
             (conj
               new-collection
               (first current-collection)
               value))
      new-collection)))
 0 [1 2 3]) ;;incorrect :(


((fn [value collection]
  (butlast 
    (interleave collection
                 (repeat value))))
 0 [1 2 3])

