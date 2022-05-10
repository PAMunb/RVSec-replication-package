#!/bin/bash
###########################################################################
# Script para realizar o download do benchmark

cd ..
git clone https://github.com/OWASP-Benchmark/BenchmarkJava.git
cd BenchmarkJava/
git checkout -b rev 3ae585c2ea00de0693d67e9145b25e7e516a0928
cd ../scripts

