(ns rpslp.game)

(def victoryMap {"scissors" ["paper" "lizard"]
				:paper [:spock :rock]})

(defn evaluateContest [choice1 choice2] 
	(let lowerChoice clojure.string/lower-case choice1)
	(if (= lowerChoice choice2) 0
	(if (> (.indexOf (get victoryMap (clojure.string/lower-case choice1) choice2) -1) 1 -1)))
)
