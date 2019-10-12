(fn it [f x]
  (lazy-seq (cons x (it f (f x)))))
