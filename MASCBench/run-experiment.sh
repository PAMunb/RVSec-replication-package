echo "Running RVSec"

cd assets/mascBench

rm -f output/*.*

mvn package --q

mv output/summary.csv ../../results/mop.csv

cd target

echo "Running CogniCrypt"

java -Xss4096m -Xmx12000m -Xms4096m \
     -cp ../../../../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
     --reportFormat SARIF --reportPath . \
     --rulesDir ../../../../tools/rules \
     --appPath mascBench-1.0-SNAPSHOT.jar

mv CryptoAnalysis-Report.json ../../../results

echo "Running CryptoGuard"

java -jar ../../../../tools/cryptoguard-develop.jar  -in jar -s mascBench-1.0-SNAPSHOT.jar -o CryptoGuard-Report.json

mv CryptoGuard-Report.json ../../../results

cd ../../../results

python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cognicrypt.csv

python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cryptoguard.csv

rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json

echo "The outputs have been exported to the results folder"
