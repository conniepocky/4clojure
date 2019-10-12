(partition 2 1"waaaaaaaaaaaaaffle")

<<<<<<< HEAD
(fn [waffle]
   (flatten
     (filter
      (not= (first waffle) (second waffle))))
=======
((fn [waffle]
   (flatten
     (filter
      (not= (first waffle) (second waffle)))))
>>>>>>> 8b058fe2e32c893cc50add71c6fcab5574f7deab
 [1 1])

(fn [a]
  (map first (partition-by identity a)))
