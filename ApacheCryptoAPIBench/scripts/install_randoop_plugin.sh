#!/bin/bash

#https://github.com/5aab/randoop-maven-plugin#start-of-content

cd ../apache_codes

git clone https://github.com/5aab/randoop-maven-plugin.git
cd randoop-maven-plugin
git checkout -b v4.3.0 b069486acc259fdc959faa65c23a01299030c525
mvn initialize
mvn clean install

cd ../../scripts
