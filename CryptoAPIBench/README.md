
### **RV-Sec and Static Analysis tools**

In order to reproduce the RV-Sec, CogniCrypt and CryptoGuard results, execute the following steps.

   * In a new shell, execute the *run-experiment.sh* script:

```{shell}
$ ./run-experiment.sh
```
   * The RV-Sec output will be exported to:  **results/mop.csv**

   * The CogniCrypt output will be exported to:  **results/cognicrypt.csv** 
   
   * The CryptoGuard output will be exported to:  **results/cryptoguard.csv** 



### **Calculate Metrics (Precision, Recall and F-measure)**

   * In order to reproduce all metrics reported on the paper, execute the **analysis-NISTBench.Rmd** manualy using RStudio or running the script **analysis.sh**:

```{shell}
$ cd scripts
$ ./analysis.sh
```
   * The output of **analysis.sh** script is the file **analysis-CryptoAPIBench.html** and you can open it on your browser. 
   