### **RV-Sec**

In order to reproduce the RV-Sec results, execute the following steps:

   * Install the Benchmark Plugin:

```{shell}
$ cd BenchmarkUtils 
$ mvn install
$ cd ..
```
   * Execute the Benchmark:

```{shell}
$ cd BenchmarkJava 
$ ./runBenchmark.sh
```

   * Verify if the Benchmark is running on: [https://localhost:8443/benchmark/](https://localhost:8443/benchmark/)

   * In a new shell, execute the crawler:

```{shell}
$ ./runCrawler.sh
```

   * The RV-Sec output will be exported to:  **../results/datasets/mop.csv** 
 
  
### **Static Analysis tools**

In order to reproduce the CogniCrypt and CryptoGuard results, execute the following steps.

   * In a new shell, execute the *run-experiment.sh* script:

```{shell}
$ ./run-experiment.sh
```
   * The CogniCrypt output will be exported to:  **../results/datasets/cognicrypt.csv** 
   
   * The CryptoGuard output will be exported to:  **../results/datasets/cryptoguard.csv** 




### **Calculate Metrics (Precision, Recall and Fmeasure)**

   * In order to reproduce all metrics reported on the paper, execute the **analysis-OWASPBench.Rmd** manualy using RStudio or running the script **analysis.sh**:

```{shell}
$ cd scripts
$ ./analysis.sh
```
   * The output of **analysis.sh** script is the file **analysis-OWASPBench.html** and you can open it on your browser. 
   

   * The script **analysis.py** calculates the precision and recall of the three tools:

```{shell}
$ python3 analysis.py
```
