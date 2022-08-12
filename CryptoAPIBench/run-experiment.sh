echo "Running RVSec"

cd assets/cryptoAPIBench

rm -f output/*.*

mvn package --q

mv output/summary.csv ../../results/mop.csv

cd target

echo "Running CogniCrypt"

java -cp ../../../../tools/CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
     --sarifReport --reportDir . \
     --rulesDir ../../../../tools/rules \
     --applicationCp cryptoAPIBench-1.0-SNAPSHOT.jar

mv CogniCrypt-SARIF-Report.txt ../../../results/CryptoAnalysis-Report.json

echo "Running CryptoGuard"

java -jar ../../../../tools/cryptoguard-develop.jar  -in jar -s cryptoAPIBench-1.0-SNAPSHOT.jar -o CryptoGuard-Report.json

mv CryptoGuard-Report.json ../../../results

cd ../../../results

python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cognicrypt.csv

python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cryptoguard.csv

rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json

echo "The outputs have been exported to the results folder"
