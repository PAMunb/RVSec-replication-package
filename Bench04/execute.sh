#!/bin/bash

cd apache_codes

mvn -am

##### ARTEMIS #############################################################
#cd activemq-artemis/
#mvn clean test -pl artemis-commons --also-make # --also-make-dependents
#cd ..


##### DELTASPIKE #############################################################
#cd deltaspike/
#mvn clean test -pl deltaspike/core/impl --also-make # --also-make-dependents
#cd ..


##### KERBEROS-CODEC #############################################################
#cd directory-ldap-api/
#mvn clean install -pl asn1 --also-make -DskipTests -Dcheckstyle.skip
#cd ..

#cd directory-server/
#mvn clean test -pl kerberos-codec --also-make
#cd ..


##### MANIFOLD #############################################################
#cd manifoldcf/
#mvn clean test -pl framework/core --also-make
#cd ..


##### MEECROWAVE #############################################################
#cd openwebbeans-meecrowave/
#mvn clean test -pl meecrowave-core -am
#cd ..


##### SPARK #############################################################
cd spark/
mvn clean test -pl core -am
cd ..


##### TIKA #############################################################
#cd tika/
#mvn clean test -pl tika-core -am
#cd ..


##### TOMEE #############################################################
#cd tomee/
#mvn clean install -DskipTests -pl container/openejb-core -am
#cd container/openejb-core
#mvn test
#cd ..


##### WICKET #############################################################
#cd wicket/
#mvn clean test -pl wicket-util -am
#cd ..
