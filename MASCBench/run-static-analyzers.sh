cd assets

java -Xss4096m -Xmx12000m -Xms4096m \
     -cp ../../tools/CryptoAnalysis-3a78193.jar crypto.HeadlessCryptoScanner \
     --reportFormat SARIF --reportPath . \
     --rulesDir ../../tools/rules \
     --appPath Bench03-1.0-SNAPSHOT.jar

mv CryptoAnalysis-Report.json ../results

java -jar ../../tools/cryptoguard-develop.jar  -in jar -s Bench03-1.0-SNAPSHOT.jar -o CryptoGuard-Report.json

mv CryptoGuard-Report.json ../results

cd ../results

