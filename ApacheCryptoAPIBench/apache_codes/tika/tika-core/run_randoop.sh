#!/bin/bash

#
# https://randoop.github.io/randoop/manual/index.html#command-line-options
#

java -Xmx8000m -classpath ./target/classes:${RANDOOP_JAR} randoop.main.Main gentests \
	--classlist=randoop_test_classes.txt \
	--output-limit=200 --time-limit=60 --testsperfile=5000 \
	--junit-package-name=randoop \
	--junit-output-dir=src/test/java \
	--regression-test-basename=RandoopRegressionTest \
	--no-error-revealing-tests
