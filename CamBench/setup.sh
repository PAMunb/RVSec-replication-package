#!/bin/env bash

git clone https://github.com/CROSSINGTUD/CamBench.git tmp
mv tmp/* .
rm -fr tmp
pip install pyyaml
pip install flatten_dict
./parse_metadata.py > metadata.csv
