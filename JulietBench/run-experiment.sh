rm results/cognicrypt.csv
rm results/cryptoguard.csv
rm results/mop.csv

cd benchmark

if [[ -z "${JAVA_HOME}" ]]; then
	echo "Please set JAVA_HOME path before running the script."
	exit -1
fi

PATH_RVSEC=$(mvn help:evaluate -Dexpression=settings.localRepository -q -DforceStdout)/br/unb/cic
if [[ ! -d $PATH_RVSEC ]]; then
	../../scripts/build_rvsec.sh
fi

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

echo "Standardizing CongniCrypt output"
cd ../../results
python3 ../../scripts/process-cc-report.py CogniCrypt-Report.json cc.csv
(head -n1 cc.csv && tail -n+2 cc.csv | sort) > cognicrypt.csv 
rm cc.csv
rm CogniCrypt-Report.json


cd ../benchmark

echo "(d) Running the test suite with RVSec enabled"

rm -f output/summary.csv
mvn clean test -Pmop -q
(head -n1 output/summary.csv && tail -n+2 output/summary.csv | sort) > ../results/mop.csv 

echo "Done. The outputs of the tools have been exported to the results folder"
