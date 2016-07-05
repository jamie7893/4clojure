 (ns 4clojure)
(fn [l] (loop [new-vec [] list l]
          (if (not-empty list)
            (let [[x & therest] list]
              (if (coll? x)
                (recur (concat new-vec (flat x)) therest)
                (recur (conj new-vec x) therest)))
            (sort new-vec))))