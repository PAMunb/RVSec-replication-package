### CrySL

In order to reproduce the CrySL results, execute the following steps.

   * Running CrypotAnalysis (CrySL) 

```{shell}
$ cd tools

$ java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../results \
           --rulesDir ./rules \
           --applicationCp ../assets/../asset/rigorityj-samples-1.0-SNAPSHOT.jar
```

   * Converting the CryptoAnalysis outcomes to a CSV file

```{shell}
$ cd ../results

$ mv CogniCrypt-SARIF-Report.txt CogniCrypt-Report.json

$ python3 ../scripts/process-cc-report.py ./CogniCrypt-Report.json CogniCrypt-Report.csv

```