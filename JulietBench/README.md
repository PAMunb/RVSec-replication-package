
### **RV-Sec and Static Analysis tools**

In order to reproduce the RV-Sec, CogniCrypt and CryptoGuard results, execute the following steps.

   * In a new shell, execute the *run-experiment.sh* script:

```{shell}
$ ./run-experiment.sh
```
   * The RV-Sec output will be exported to:  **results/mop.csv**

   * The CogniCrypt output will be exported to:  **results/cognicrypt.csv** 
   
   * The CryptoGuard output will be exported to:  **results/cryptoguard.csv** 



<!-- ### **Calculate Metrics (Precision, Recall and F-measure)**

   * In order to reproduce the metrics reported on the paper:

```{shell}
$ cd scripts
```

   * The script *analysis.py* calculates the precision and recall of the three tools:

```{shell}
$ python3 analysis.py
```

   * To reproduce all metrics in a deep way, use the analysis-OWASPBench.Rmd script -->
