#!/bin/bash

# initial build (to download and install all dependencies)

cd apache_codes

##### ARTEMIS #############################################################
cd activemq-artemis/
mvn clean install -pl artemis-commons --also-make # --also-make-dependents
cd ..


##### DELTASPIKE #############################################################
cd deltaspike/
mvn clean install -pl deltaspike/core/impl --also-make
cd ..


##### KERBEROS-CODEC #############################################################
cd directory-ldap-api/
mvn clean install -pl ldap --also-make -DskipTests -Dcheckstyle.skip
cd ..

cd directory-server/
mvn clean install -pl kerberos-codec --also-make
cd ..


##### MANIFOLD #############################################################
cd manifoldcf/
mvn clean install -pl framework/core --also-make
cd ..


##### MEECROWAVE #############################################################
cd openwebbeans-meecrowave/
mvn clean install -pl meecrowave-core -am
cd ..


##### SPARK #############################################################
cd spark/
mvn clean install -pl core -am
cd ..


##### TIKA #############################################################
cd tika/
mvn clean install -pl tika-core -am
cd ..


##### TOMEE #############################################################
cd tomee/
mvn clean install -DskipTests -pl container/openejb-core -am
#cd container/openejb-core
#mvn test
#cd ../../..
cd ..


##### WICKET #############################################################
cd wicket/
mvn clean install -pl wicket-util -am
cd ..
