(ns groupme-api.endpoints)

(def api-root "https://api.groupme.com/v3")
(def bots (str api-root "/bots"))
(def bots-message (str bots "/post"))
