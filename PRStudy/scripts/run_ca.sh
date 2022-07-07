#!/bin/bash

cd ../../tools

java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/seata-common-1.5.0.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-seata-common.json
          

java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/io.onedev.server-core-7.4.1.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-server-core.json
           

cd -   
