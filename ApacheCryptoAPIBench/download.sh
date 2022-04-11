#!/bin/bash
###########################################################################
# Script para realizar o download dos projetos, nas revisions especificas,
# no diretorio atual/corrente. Compila e testa os módulos utilizados.

##### ARTEMIS #############################################################
git clone https://github.com/apache/activemq-artemis.git
cd activemq-artemis/
git checkout -b rev 5ab187b7fef5ed6ad8a857287417f55878678714
cd ..



##### DELTASPIKE #############################################################
git clone https://github.com/apache/deltaspike.git
cd deltaspike/
git checkout -b rev d95abe8c
cd ..



##### KERBEROS-CODEC #############################################################
git clone https://github.com/apache/directory-ldap-api.git
cd directory-ldap-api/
git checkout -b rev 994075b13579e0c83047f9cf006ce8f518cec5b7 

# *** MANUALLY: comment module <module>first-benchmark</module> in pom.xml
# TODO: check other revisions
read -r -d '' POM << EOM
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>org.apache.directory.api</groupId>
    <artifactId>api-parent</artifactId>
    <version>2.0.0-M1-SNAPSHOT</version>
  </parent>
  
  <artifactId>first-benchmark</artifactId>
</project>
EOM
mkdir first-benchmark
echo $POM > first-benchmark/pom.xml
cd ..

git clone https://github.com/apache/directory-server.git
cd directory-server/
git checkout -b rev 155bd94805
cd ..



##### MANIFOLD #############################################################
git clone https://github.com/apache/manifoldcf.git
cd manifoldcf/
git checkout -b rev 9573dc44c
# TODO: verificar em outra revision se esse teste compila
rm framework/core/src/test/java/org/apache/manifoldcf/core/tests/SeleniumTester.java
cd ..



##### MEECROWAVE #############################################################
git clone https://github.com/apache/openwebbeans-meecrowave.git
cd openwebbeans-meecrowave/
git checkout -b rev 3780f1c
cd ..



##### SPARK #############################################################
git clone https://github.com/apache/spark.git
cd spark/
git checkout -b rev 9ff1d96f01e2c89acfd248db917e068b93f519a6
# TODO: verificar em outra revision se esse teste executa corretamente
rm ./core/src/test/scala/org/apache/spark/metrics/sink/StatsdSinkSuite.scala
cd ..



##### TIKA #############################################################
git clone https://github.com/apache/tika.git
cd tika/
git checkout -b rev 6f33bae5c
cd ..



##### TOMEE #############################################################
git clone https://github.com/apache/tomee.git
cd tomee/
git checkout -b rev b541bb41e3
cd ..



##### WICKET #############################################################
git clone https://github.com/apache/wicket.git
cd wicket/
git checkout -b rev dbd86d96a5
cd ..
