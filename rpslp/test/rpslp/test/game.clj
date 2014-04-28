(ns rpslp.test.game
  (:require [midje.sweet :refer :all]
        [rpslp.game :refer :all]))
  
(fact "testing random computer generated action"
   (get-computer-pick) => "Rock")

(fact "testing get-winner"
  (get-winner "Rock" "Spock") => "You lose"
  (get-winner "Rock" "Rock") => "Tie"
  (get-winner "Rock" "Scissors") => "You win")

; (fact "gets formatted result"
;   (format-result "Paper" "Rock" 1) => "You picked Paper and the computer picked Rock.  You won."
;   )