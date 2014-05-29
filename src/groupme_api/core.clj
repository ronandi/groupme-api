(ns groupme-api.core
  (:require [clj-http.client :as http]
            [groupme-api.endpoints :as endpoints]))

(def ^:dynamic *token*)

(defn bot-send-message
  [text & {:keys [token] :or {token *token*}}]
  (let [body {:form-params {:bot_id token :text text}}]
    (try
      (http/post endpoints/bots-message body)
      (catch Exception e
        (ex-info "Message could not be sent. Check your token." (ex-data e))))))
