#!/bin/bash
###########################################################################
# Script para realizar o download do benchmark

cd ..

git clone https://github.com/OWASP-Benchmark/BenchmarkUtils.git
cd BenchmarkUtils/
git checkout -b rev dfa138c76c770fccb122ab0f6e83428bca93f428
mvn clean install
cd ..

git clone https://github.com/OWASP-Benchmark/BenchmarkJava.git
cd BenchmarkJava/
git checkout -b rev 3ae585c2ea00de0693d67e9145b25e7e516a0928
cd ../scripts

