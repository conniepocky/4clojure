(fn [n x]
  (let [h (quot (count x) n)]
    (for [i (take h (range 0 (count x) n))]
      (take n (drop i x)))))
