#!/bin/bash

cd ../../tools


java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/io.onedev.server-core-7.4.1.jar \
	    -o ../PRStudy/results/CryptoGuard-onedev-server-core.json   
	    
	    
java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/seata-common-1.5.0.jar \
	    -o ../PRStudy/results/CryptoGuard-seata-common.json       
	    

java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/shenyu-plugin-cryptor-2.4.3.jar \
	    -o ../PRStudy/results/CryptoGuard-shenyu-plugin-cryptor.json  
	    	   
	
java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/shiro-crypto-cipher-1.9.1.jar \
	    -o ../PRStudy/results/CryptoGuard-shiro-crypto-cipher.json 
	    

java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/shiro-crypto-hash-1.9.1.jar \
	    -o ../PRStudy/results/CryptoGuard-shiro-crypto-hash.json 

	    	    	    
cd -	    
