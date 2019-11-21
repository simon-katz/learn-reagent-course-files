(ns cljs.user
  "Namespace to support hacking at the CLJS REPL."
  (:require [giggin.core]))

;;;; ___________________________________________________________________________
;;;; cljs dev stuff

(defn post-interactive-eval-hook []
  (giggin.core/main))

(comment

  ;; To re-render after evaluating forms and without saving files:
  (giggin.core/main)

  giggin.state/orders)
