;; defn executed every time is called

(defn resumo [transacao]
    (select-keys transacao [:valor :tipo :data]))

;; def executed only once
(def transacoes
    [{:valor 33.0 :tipo "despesa"
    :comentario "Almoço" :data "19/11/2016"}
    {:valor 2700.0 :tipo "receita"
    :comentario "Bico" :data "01/12/2016"}
    {:valor 29.0 :tipo "despesa"
    :comentario "Livro de Clojure" :data "03/12/2016"}])

(println (map resumo transacoes))

(defn despesa? [transacao]
    (= (:tipo transacao) "despesa"))

(println (filter despesa? transacoes))

(defn so-valor [transacao]
    (:valor transacao))

(reduce + (map so-valor (filter despesa? transacoes)))

;; not anonymous functions
(defn valor-grande? [transacao]
    (> (:valor transacao) 100))

(println (filter valor-grande? transacoes))

;; anonymous functions
(println (filter (fn [transacao]
    (> (:valor transacao) 100))
    transacoes))