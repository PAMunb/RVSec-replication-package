#!/bin/bash

#https://github.com/5aab/randoop-maven-plugin#start-of-content

cd ../apache_codes

git clone https://github.com/5aab/randoop-maven-plugin.git
cd randoop-maven-plugin
mvn initialize
mvn clean install

cd ../../scripts
