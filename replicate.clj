;; Replicate a sequence

(fn [c r]
  (if (= 1 r)
    c
    (apply interleave (repeat r c))))
