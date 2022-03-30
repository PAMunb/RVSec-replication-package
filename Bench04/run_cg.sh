#!/bin/bash

cd ../tools

java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/apacheds-kerberos-codec-2.0.0-M25-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-apacheds-kerberos-codec.json       
	    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/artemis-commons-2.5.0-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-artemis-commons.json     
	    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/deltaspike-core-impl-1.8.1-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-deltaspike-core-impl.json     
	    

java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/mcf-core-2.9-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-mcf-core.json    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/meecrowave-core-1.2.0-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-meecrowave-core.json     
	    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/spark-core_2.11-2.4.0-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-spark-core_2.11.json     
	    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/tika-core-1.17-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-tika-core.json  
	    
	    	    
java -jar CryptoGuard.jar -in jar \
            -s ../Bench04/assets/wicket-util-8.0.0-SNAPSHOT.jar \
	    -o ../Bench04/results/CryptoGuard-wicket-util.json     	
	    
cd -	    
