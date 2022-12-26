#!/bin/bash

for FILE in assets/*; do
    java -Xss4096m -Xmx12000m -Xms4096m \
         -cp ../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
         --reportFormat SARIF --reportPath results \
         --rulesDir ../tools/rules/ \
         --appPath $FILE 
    
    OUTPUT_FILE=results/CogniCrypt-$(basename $FILE | sed -e 's/-[0-9].*$//g')
    mv results/CryptoAnalysis-Report.json $OUTPUT_FILE.json
    python3 ../scripts/process-cc-report.py $OUTPUT_FILE.json $OUTPUT_FILE.csv
done

#java -Xss4096m -Xmx12000m -Xms4096m -cp ../tools/CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
#            --sarifReport --reportDir results \
#            --rulesDir ../tools/rules \
#            --applicationCp $FILE 
#    OUTPUT_FILE=results/CogniCrypt-$(basename $FILE | sed -e 's/-[0-9].*$//g')_old
#    mv results/CogniCrypt-SARIF-Report.txt $OUTPUT_FILE.json
#    python3 ../scripts/process-cc-report.py $OUTPUT_FILE.json $OUTPUT_FILE.csv