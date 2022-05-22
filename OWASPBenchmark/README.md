### CrySL

In order to reproduce the CrySL results, execute the following steps.

   * Running CrypotAnalysis (CrySL) 

```{shell}
$ cp benchmark.war benchmark.jar
$ java -Xmx8g -Xss60m -cp ../tools/CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ./results \
           --rulesDir ../tools/rules \
           --applicationCp ./assets/benchmark.jar
```

   * Converting the CryptoAnalysis outcomes to a CSV file

```{shell}
$ cd results

$ mv CogniCrypt-SARIF-Report.txt CogniCrypt-Report.json

$ python3 ../../scripts/process-cc-report.py ./CogniCrypt-Report.json CogniCrypt-Report.csv

```


### CryptoGuard

In order to reproduce the CryptoGuard results, execute the following steps.

   * Running CrypotGuard

```{shell}
$ cp benchmark.war benchmark.jar

$ java -jar ../tools/CryptoGuard.jar -in jar \
		-s assets/benchmark.jar \
		-o results/CryptoGuard-Report.json
```   

* Converting the CryptoGuard outcomes to a CSV file

```{shell}
$ cd results

$ python3 ../../scripts/process-cg-report.py ./CryptoGuard-Report.json CryptoGuard-Report.csv
```
