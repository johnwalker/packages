(set-env!
  :resource-paths #{"resources"}
  :dependencies '[[adzerk/bootlaces "0.1.9" :scope "test"]
                  [cljsjs/boot-cljsjs "0.5.0" :scope "test"]
                  [cljsjs/react "0.13.3-0"]])

(require '[adzerk.bootlaces :refer :all]
         '[cljsjs.boot-cljsjs.packaging :refer :all])

(def +version+ "0.11.1-0")

(task-options!
  pom  {:project     'cljsjs/material-ui
        :version     +version+
        :description "Material-ui React components"
        :url         "http://material-ui.com"
        :license     {"MIT" "http://opensource.org/licenses/MIT"}
        :scm         {:url "https://github.com/cljsjs/packages"}})

(deftask package []
  (deps-cljs :name "cljsjs.material-ui"
             :requires ["cljsjs.react"]))
