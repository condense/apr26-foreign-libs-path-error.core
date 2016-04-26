(require 'cljs.closure)



(in-ns 'cljs.closure)

(defn foreign-deps-str [opts sources]
  (letfn [(to-js-str [ijs]
            (if-let [url (or (and (#{:advanced :simple} (:optimizations opts))
                                  (:url-min ijs))
                             (:url ijs))]
              (slurp url)
              (throw (ex-info "Unable to resolve url for foreign-deps source" ijs))))]
    (str (string/join "\n" (map to-js-str sources)) "\n")))




(in-ns 'user)

(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
           {:output-to     "release/apr26_foreign_libs_path_error.js"
            :output-dir    "release"
            :optimizations :advanced
            :verbose       true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
