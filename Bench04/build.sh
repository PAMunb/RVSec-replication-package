#!/bin/bash

VERSION=3.8.4
IMAGE=phtcosta/maven

#docker build -t $IMAGE:$VERSION $(dirname $0)
docker build -t $IMAGE:$VERSION $(dirname $0)

ID=$(docker images | grep "$IMAGE" | head -n 1 | awk '{print $3}')

docker tag "$ID" $IMAGE:latest
docker tag "$ID" $IMAGE:$VERSION
