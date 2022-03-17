#!/bin/bash

cd apache_codes

##### ARTEMIS #############################################################
cd activemq-artemis/
mvn clean test -pl artemis-commons --also-make 
cd ..


##### DELTASPIKE #############################################################
cd deltaspike/
mvn clean test -pl deltaspike/core/impl --also-make 
cd ..


##### KERBEROS-CODEC #############################################################
cd directory-server/
mvn clean test -pl kerberos-codec --also-make
cd ..


##### MANIFOLD #############################################################
cd manifoldcf/
mvn clean test -pl framework/core --also-make
cd ..


##### MEECROWAVE #############################################################
cd openwebbeans-meecrowave/
mvn clean test -pl meecrowave-core -am
cd ..


##### SPARK #############################################################
cd spark/
mvn clean test -pl core -am
cd ..


##### TIKA #############################################################
cd tika/
mvn clean test -pl tika-core -am
cd ..


##### TOMEE #############################################################
#cd tomee
#mvn clean test -pl container/openejb-core -am
#cd ..


##### WICKET #############################################################
cd wicket/
mvn clean test -pl wicket-util -am
cd ..
