(defn parse-input [file] (map #(- (int %) 48) (seq (slurp file))))
(defn format-input [input] (concat (drop-last input) [(first input)]))
(defn reduce-input [input] (reduce (fn [[agg prev-elem] next-elem] [(+ agg (if (== prev-elem next-elem) prev-elem 0)) next-elem]) [0 0] input))

(def solution (-> "input.txt" parse-input format-input reduce-input first))



