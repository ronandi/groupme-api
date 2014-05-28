(ns groupme-api.core-test
  (:require [clojure.test :refer :all]
            [groupme-api.core :refer :all]
            [environ.core :refer [env]]))

(def test-token (env :groupme-api-test-token))

(deftest bot-send-message-test
  (testing "Send message as a bot"
    (is (= 202 (:status (bot-send-message "This is a test" :token test-token))))))
