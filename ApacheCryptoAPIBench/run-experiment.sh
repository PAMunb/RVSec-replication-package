if [[ -z "${JAVA_HOME}" ]]; then
	echo "Please set JAVA_HOME path before running the script."
	exit -1
fi

PATH_RVSEC=$(mvn help:evaluate -Dexpression=settings.localRepository -q -DforceStdout)/br/unb/cic
if [[ ! -d $PATH_RVSEC ]]; then
	../scripts/build_rvsec.sh
fi

#echo "Running RVSec"


echo "Running CogniCrypt"
./run_ca.sh

echo "Running CryptoGuard"
./run_cg.sh

#echo "Standardizing CogniCrypt and CryptoGuard output"
#cd results
#python3 ../scripts/process-cc-report.py CryptoAnalysis-Report.json cc.csv
#(head -n1 cc.csv && tail -n+2 cc.csv | sort) > cognicrypt.csv 
#rm cc.csv

#python3 ../../scripts/process-cg-report.py CryptoGuard-Report.json cg.csv
#(head -n1 cg.csv && tail -n+2 cg.csv | sort) > cryptoguard.csv
#rm cg.csv
#rm CryptoAnalysis-Report.json
#rm CryptoGuard-Report.json

#echo "The outputs have been exported to the results folder"