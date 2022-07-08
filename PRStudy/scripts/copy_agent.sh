#!/bin/bash
###########################################################################
# Script to copy the agent from the project root

AGENT_JAR=../../JavaMOPAgent.jar

cp -v $AGENT_JAR ../codes/seata/common/
cp -v $AGENT_JAR ../codes/onedev/server-core/
cp -v $AGENT_JAR ../codes/incubator-shenyu/shenyu-plugin/shenyu-plugin-cryptor/

