(ns kata-create-phone-number.kata-create-phone-number)

(defn stringify [v]
  (clojure.string/join "" v))

(defn create-phone-number [nums]
  (let [a (subvec nums 0 3)
        b (subvec nums 3 6)
        c (subvec nums 6)]
    (str "(" (stringify a) ") " (stringify b) "-" (stringify c))))

(create-phone-number [1 2 3 4 5 6 7 8 9 0])
