
Demonstrate a fix for unfriendly clojurescript compiler error where foreign libs has an invalid :file path

See
http://dev.clojure.org/jira/browse/CLJS-1633

Possible fix is demonstrated by patching cljs.closure/foreign-deps-str before doign compile, shown in:

https://github.com/condense/apr26-foreign-libs-path-error.core/blob/master/scripts/release-with-patch.clj
