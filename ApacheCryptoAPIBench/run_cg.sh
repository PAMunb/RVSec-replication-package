#!/bin/bash

for FILE in assets/*; do
    OUTPUT_FILE=results/CryptoGuard-$(basename $FILE | sed -e 's/-[0-9].*$//g')
    java -jar ../tools/cryptoguard-develop.jar -in jar \
         -s $FILE \
         -o $OUTPUT_FILE.json
    python3 ../scripts/process-cg-report.py $OUTPUT_FILE.json $OUTPUT_FILE.csv
done