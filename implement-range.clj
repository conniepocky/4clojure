(range 1 4) ;; Not allowed :(

;; Long Answer

(fn [s e]
  (loop [start s
         end e
         numbers []]
    (if (= start end)
      numbers
      (recur (inc start) end (conj numbers start)))))

