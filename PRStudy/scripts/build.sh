#!/bin/bash
###########################################################################
# Script to build the projects.

cd ../codes


##### ONEDEV #############################################################
#git clone https://github.com/theonedev/onedev.git
cd onedev
#git checkout v7.4.1
mvn clean install -pl server-core --also-make # --also-make-dependents
cd ..


##### SEATA #############################################################
#git clone https://github.com/seata/seata.git
cd seata/
#git checkout v1.5.1
mvn clean install -pl common --also-make 
cd ..


##### SHENYU #############################################################
#git clone https://github.com/apache/incubator-shenyu.git
cd incubator-shenyu
#git checkout v2.4.3
mvn clean install -pl shenyu-plugin/shenyu-plugin-cryptor --also-make -Drat.skip
cd ..

