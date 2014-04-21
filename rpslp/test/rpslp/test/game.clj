(ns rpslp.test.game
  (:use clojure.test
        rpslp.game))


(deftest test-app

  
  (testing "scissors beats paper"
  	(is (= (evaluateContest "scissors" "paper")  1 )))
  (testing "Scissors ties with scissors"
  	(is (= (evaluateContest "Scissors" "scissors")  0 )))
  (testing "scissors loses to spock"
  	(is (= (evaluateContest "scissors" "spock") -1)))
  (testing "scissors ties with scissors"
  	(is (= (evaluateContest "scissors" "scissors") 0 )))
)
  