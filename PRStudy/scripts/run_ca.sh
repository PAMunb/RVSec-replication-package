#!/bin/bash

cd ../../tools

       
java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/io.onedev.server-core-7.4.1.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-onedev-server-core.json
           

java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/seata-common-1.5.0.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-seata-common.json


java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/shenyu-plugin-cryptor-2.4.3.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-shenyu-plugin-cryptor.json


java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/shiro-crypto-cipher-1.9.1.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-shiro-crypto-cipher.json


java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../PRStudy/results \
           --rulesDir ./rules \
           --applicationCp ../PRStudy/assets/shiro-crypto-hash-1.9.1.jar
mv ../PRStudy/results/CogniCrypt-SARIF-Report.txt ../PRStudy/results/CogniCrypt-shiro-crypto-hash.json

cd -   
