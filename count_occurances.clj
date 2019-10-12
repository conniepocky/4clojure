(fn [xs]
  (into {}
        (map
          (fn [[k v]] {k (count v)}))))
