#!/bin/bash
###########################################################################
# Script to build the projects.

cd ../codes


##### SEATA #############################################################
#git clone https://github.com/seata/seata.git
cd seata/
#git checkout v1.5.1
mvn clean install -pl common --also-make 
cd ..


##### ONEDEV #############################################################
#git clone https://github.com/theonedev/onedev.git
cd onedev
#git checkout v7.4.1
mvn clean install -pl server-core --also-make # --also-make-dependents
cd ..


