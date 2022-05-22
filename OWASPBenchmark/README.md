### CrySL

In order to reproduce the CrySL results, execute the following steps.

   * Running CrypotAnalysis (CrySL) 

```{shell}
$ java -Xmx8g -Xss60m -cp ../tools/CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ./results \
           --rulesDir ../tools/rules \
           --applicationCp ./assets/classes/testcode/
```

   * Converting the CryptoAnalysis outcomes to a CSV file

```{shell}
$ cd results 
$ mv CogniCrypt-SARIF-Report.txt CogniCrypt-Report.json

$ python3 ../../scripts/process-cc-report.py ./CogniCrypt-Report.json CogniCrypt-Report.csv

```


### CryptoGuard

TODO
