#!/bin/bash

cd ../tools

java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/apacheds-kerberos-codec-2.0.0-M25-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-apacheds-kerberos-codec.json
           

java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/artemis-commons-2.5.0-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-artemis-commons.json
           
           
java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/deltaspike-core-impl-1.8.1-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-deltaspike-core-impl.json           
           
 
java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/mcf-core-2.9-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-mcf-core-core.json  
 
           
java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/meecrowave-core-1.2.0-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-meecrowave-core.json            
           
           
java -Xss4096m -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/spark-core_2.11-2.4.0-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-spark-core_2.11.json                 
           

java -Xss4096m -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/tika-core-1.17-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-tika-core.json 
     
           
java -cp CryptoAnalysis.jar crypto.HeadlessCryptoScanner \
           --sarifReport --reportDir ../Bench04/results \
           --rulesDir ./rules \
           --applicationCp ../Bench04/assets/wicket-util-8.0.0-SNAPSHOT.jar
mv ../Bench04/results/CogniCrypt-SARIF-Report.txt ../Bench04/results/CogniCrypt-wicket-util.json

cd -   
