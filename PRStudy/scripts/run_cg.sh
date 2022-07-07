#!/bin/bash

cd ../../tools


java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/seata-common-1.5.0.jar \
	    -o ../PRStudy/results/CryptoGuard-seata-common.json       
	    

java -jar CryptoGuard.jar -in jar \
            -s ../PRStudy/assets/io.onedev.server-core-7.4.1.jar \
	    -o ../PRStudy/results/CryptoGuard-server-core.json   
	   
	    
cd -	    
