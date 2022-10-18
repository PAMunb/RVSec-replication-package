#!/bin/bash

cd ..

git clone https://github.com/EvoSuite/evosuite.git
cd evosuite
git checkout -b 1.2.0 312a417f7d6d17b8b13f6e633458098d1b72920e
#git rev-parse HEAD
mvn clean install -DskipTests

cd ../scripts
