cd assets/

echo "Running CogniCrypt"

java -Xss4096m -Xmx12000m -Xms4096m \
     -cp ../../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
     --reportFormat SARIF --reportPath . \
     --rulesDir ../../tools/rules \
     --appPath benchmark.jar

mv CryptoAnalysis-Report.json ../results

echo "Running CryptoGuard"

java -jar ../../tools/cryptoguard-develop.jar  -in jar -s benchmark.jar -o CryptoGuard-Report.json

mv CryptoGuard-Report.json ../results

cd ../results

python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cognicrypt.csv
(head -n1 cognicrypt.csv && tail -n+2 cognicrypt.csv | sort) > datasets/cognicrypt.csv 

python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cryptoguard.csv
(head -n1 cryptoguard.csv && tail -n+2 cryptoguard.csv | sort) > datasets/cryptoguard.csv


rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json
rm cryptoguard.csv
rm cognicrypt.csv

echo "The outputs have been exported to the results folder"
