(ns rpslp.game)

(defn get-computer-pick []
	"Rock")

(def victory-map
	{"Rock" #{"Scissors" "Lizard"}
     "Paper" #{"Spock" "Rock"}
     "Scissors" #{"Paper" "Lizard"}
     "Lizard" #{"Spock" "Paper"}
     "Spock" #{"Rock" "Scissors"}})

(defn get-winner [pick1 pick2]
	(cond
		(= pick1 pick2) "Tie"
		(contains? (victory-map pick1) pick2) "You win"
		:else "You lose"))

; (defn format-result [action computer winner]

; 	)