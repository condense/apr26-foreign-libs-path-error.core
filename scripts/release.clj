
(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
           {:output-to     "release/apr26_foreign_libs_path_error.js"
            :output-dir    "release"
            :optimizations :advanced
            :verbose       true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
