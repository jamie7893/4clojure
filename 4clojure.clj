 (ns 4clojure)
(fn [l] (loop [new-vec [] list l]
          (if (not-empty list)
            (let [[x & therest] list]
              (if (coll? x)
                (recur (concat new-vec (flat x)) therest)
                (recur (conj new-vec x) therest)))
            (sort new-vec))))

(filter (fn [y]
          (Character/isUpperCase y)) "skjKLSJDFkjs")

(map (fn [x]
       (if (= (str x) (.toUpperCase (str x)))
         (str x)
         )) "AKskdKAkfsn")

(fn [x]
  (loop [cnt 0]
    (if (= (get (vec x) cnt) nil)
      cnt
      (recur (inc cnt)))))