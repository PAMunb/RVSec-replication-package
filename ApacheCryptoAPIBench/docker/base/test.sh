#!/bin/bash

#docker exec -it --rm --name test-maven maven:3.8.4-jdk-8-slim /bin/bash
docker run -it --rm --name test-maven phtcosta/mop-base:0.0.1 /bin/bash
