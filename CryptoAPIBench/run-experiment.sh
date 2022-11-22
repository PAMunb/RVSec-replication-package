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
cd assets/cryptoAPIBench
rm -f output/*.*

echo "Running RVSec"
mvn package -q 
sort output/summary.csv > ../../results/mop.csv
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

echo "Standardizing CongniCrypt and CryptoGuard output"
cd ../../../results
python3 ../../scripts/process-cc-report.py CryptoAnalysis-Report.json cognicrypt.csv
sort cognicrypt.csv > cognicrypt.csv
python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cryptoguard.csv
sort cryptoguard.csv > cryptoguard.csv
rm CryptoAnalysis-Report.json
rm CryptoGuard-Report.json

echo "The outputs have been exported to the results folder"
