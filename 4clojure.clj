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

(fn [x]
  (loop [new-str "" cnt 0]
    (if (= cnt (count x))
      new-str
      (if (Character/isUpperCase (nth x cnt))
        (recur (str new-str (nth x cnt)) (inc cnt))
        (recur new-str (inc cnt))))))

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
    (if (= (count new-list) (* (count x) 2))
      new-list
      (recur (conj new-list (nth x cnt) (nth x cnt)) (inc cnt)))))

(fn [start end]
  (loop [start start list []]
    (if (= start end)
      list
      (recur (inc start) (conj list start)))))

(fn [x]
  (loop [newlist [] current "" cnt 0]
    (if (< (- (count x) 1) cnt)
      newlist
      (if (= current (nth x cnt))
        (recur newlist current (inc cnt))
        (recur (conj newlist (nth x cnt)) (nth x cnt) (inc cnt))))))

(fn [x]
  (reduce * (range 1 (+ x 1))))

(fn [x y]
  (loop [new-list [] cnt 0]
    (if (< (- (count x) 1) cnt)
      new-list
      (if (< (- (count y) 1) cnt)
        new-list
        (recur (conj new-list (nth x cnt) (nth y cnt)) (inc cnt))))))

(fn [x y]
  (loop [new-list [] cnt 0 at 0]
    (if (= (count x) cnt)
      new-list
      (if (= at y)
        (recur new-list (inc cnt) 0)
        (recur (conj new-list (nth x cnt)) cnt (inc at))
        ))))

(fn [y x]
  (loop [new-list [] cnt 0]
    (if (= (count new-list) (- (* (count x) 2) 1))
      new-list
      (if (= (- (count x) 1) cnt)
        (recur (conj new-list (nth x cnt)) (inc cnt))
        (recur (conj new-list (nth x cnt) y) (inc cnt))))))

(fn [x]
  (loop [new-list [] current "" cnt 0 times 0]
    (if (= (count x) cnt)
      (conj new-list (repeat times current))
      (if (= (nth x cnt) current)
        (recur new-list current (inc cnt) (inc times))
        (if (> times 0)
          (recur (conj new-list (repeat times current)) (nth x cnt) (inc cnt) 1)
          (recur new-list (nth x cnt) (inc cnt) (inc times)))))))

          (fn [x y]
          (map-indexed (fn [index value]
          #(zero? (mod y index)))
          x))

          (fn [x y](map-indexed (fn [index value] #(zero? (mod y index))) x))

       (fn [x y](apply concat (partition (dec y) y nil x)))

(into {} (map hash-map [1 2 3 4 5] [6 7 8 9 10]))

(fn gcd [x y]
  (if (= (rem x y) 0)
    y
    (gcd y (rem x y))))

(fn [x y]
  (set (remove nil? (map (fn [z]
                           (y z))
                         x))))

(fn [x y z]
  (if (x y z)
    :lt
    (if (x z y)
      :gt
      :eq)))