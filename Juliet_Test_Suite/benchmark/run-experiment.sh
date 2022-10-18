echo "(a) Building the JAR file of the benchmark"
mvn clean package -q
cd target

echo "(b) Running CryptoGuard"

java -jar ../../../tools/cryptoguard-develop.jar -m CSV -o cryptoguard.csv \
     -in jar -s julia-test-suite-1.3.jar

mv cryptoguard.csv ../../results/cryptoguard.csv

echo "(c) Running CogniCrypt (CryptoAnalysis Component)"

java -Xss4096m -Xmx12000m -Xms4096m -cp \
     ../../../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
     --reportFormat SARIF --reportPath . \
     --rulesDir ../../../tools/rules \
     --appPath julia-test-suite-1.3.jar

mv CryptoAnalysis-Report.json ../../results/CogniCrypt-Report.json

cd ../../results

python3 ../../scripts/process-cc-report.py CogniCrypt-Report.json cognicrypt.csv


cd ../benchmark

echo "(d) Running the test suite with RVSec enabled"

rm -f output/summary.csv

mvn clean test -Pmop -q

cp output/summary.csv ../results/mop.csv

echo "done. The results have been exported to the ./results folder"
