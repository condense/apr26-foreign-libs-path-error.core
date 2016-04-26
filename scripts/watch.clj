(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'apr26-foreign-libs-path-error.core
   :output-to "out/apr26_foreign_libs_path_error.js"
   :output-dir "out"})
