cd assets/

echo "Running CogniCrypt"

java -Xss4096m -Xmx12000m -Xms4096m \
     -cp ../../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
     --reportFormat SARIF --reportPath . \
     --rulesDir ../../tools/rules \
     --appPath ./CamBench_Cap/build/libs/CamBench_Cap.jar

mv CryptoAnalysis-Report.json ../results

echo "Running CryptoGuard"

java -jar ../../tools/cryptoguard-develop.jar  -in jar -s ./CamBench_Cap/build/libs/CamBench_Cap.jar -o CryptoGuard-Report.json

mv CryptoGuard-Report.json ../results

cd ../results

python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cc.csv
(head -n1 cc.csv && tail -n+2 cc.csv | sort) > cognicrypt.csv 

python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cg.csv
(head -n1 cg.csv && tail -n+2 cg.csv | sort) > cryptoguard.csv


rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json
rm cg.csv
rm cc.csv

echo "The outputs have been exported to the results folder"
