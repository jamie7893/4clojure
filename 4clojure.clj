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

(fn [y]
  (let [the-string (map (fn [x]
                          (if (= (str x) (.toUpperCase (str x)))
                            (str x)
                            )) "AKskdKAkfsn")]
    (filter identity the-string)))

(fn [x]
  (loop [cnt 0]
    (if (= (get (vec x) cnt) nil)
      cnt
      (recur (inc cnt)))))

 (fn [x]
   (loop [prev nil cnt 0]
     (if (= prev nil)
       )))

(fn [x m]
  (if (contains? m x)
    (if (= (m x) nil)
      true
      false)
    false))
 (reduce)

(fn [x] (loop [new-list [] old-list (vec x) cnt (- (count old-list) 1)]
          (if (= (count (vec new-list)) (count old-list))
            new-list
            (recur (conj new-list (nth old-list cnt)) old-list (dec cnt)))))

(let-fn [(rever [new-list]
           (if (not-empty new-list)
             (conj (rever (rest new-list)) (first new-list))
             []))])

(fn [& more-args]
  (loop [high 0 cnt 0]
    (if (= cnt (- (count (vec more-args)) 1))
      high
      (if (> (nth more-args cnt) high)
        (recur (nth more-args cnt) (inc cnt))
        (recur high (inc cnt))))))

(fn [x]
  (loop [new-list [] cnt 0]
    (if (= (* (count x) 2) (count new-list))
      new-list
      (recur (conj new-list (nth x cnt)) (inc cnt)))))