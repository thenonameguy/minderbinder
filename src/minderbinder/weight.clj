(ns minderbinder.weight
  (:require [minderbinder.core :refer (defunits-of)]))

(defunits-of weight :kilogram
  "WiP"
  :kg #{:kilograms :kilogram}
  :g 1/1000
  :gram #{:grams :g}

  :mg [1/1000 :g]
  :mg #{:milligrams :milligram}
  
  :hg [100 :grams]
  :hg #{:hectograms :hectogram}

  :dg [1/10 :g]
  :dg #{:decigrams :decigram}
  
  :dag [10 :g]
  :dag #{:decagrams :decagram}

  :cg [1/100 :g]
  :cg #{:centigram :centigrams}

  :Mg 1000
  :Mg #{:tonne :metric-ton :megagrams :megagram}

  
  )