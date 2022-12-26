rm results/cognicrypt.csv
rm results/cryptoguard.csv
rm results/mop.csv

if [[ -z "${JAVA_HOME}" ]]; then
	echo "Please set JAVA_HOME path before running the script."
	exit -1
fi

PATH_RVSEC=$(mvn help:evaluate -Dexpression=settings.localRepository -q -DforceStdout)/br/unb/cic
if [[ ! -d $PATH_RVSEC ]]; then
	../scripts/build_rvsec.sh
fi

echo "Starting RVSec"
echo "Cleaning output"
cd assets/mascBench
rm -f output/*.*

echo "Running RVSec"
mvn package -q 
(head -n1 output/summary.csv && tail -n+2 output/summary.csv | sort) > ../../results/mop.csv 
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

echo "Standardizing CongniCrypt and CryptoGuard output"
cd ../../../results
python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cc.csv
(head -n1 cc.csv && tail -n+2 cc.csv | sort) > cognicrypt.csv 
rm cc.csv

python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cg.csv
(head -n1 cg.csv && tail -n+2 cg.csv | sort) > cryptoguard.csv
rm cg.csv
rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json

echo "The outputs have been exported to the results folder"
