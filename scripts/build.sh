#!/usr/bin/env bash

set -ev

SCRIPT_DIR=$(dirname "$0")

GROUP=goodraincloudframeworks
COMMIT='latest'
jar_version="1.0.1-SNAPSHOT"
jar_name="springdata-${jar_version}.jar"

if [[ "$(uname)" == "Darwin" ]]; then
    DOCKER_CMD=docker
else
    DOCKER_CMD="sudo docker"
fi

CODE_DIR=$(cd $SCRIPT_DIR/..; pwd)
echo $CODE_DIR

cp -r $CODE_DIR/src $CODE_DIR/docker/springdata/src
cp -r $CODE_DIR/pom.xml $CODE_DIR/docker/springdata/pom.xml

REPO=${GROUP}/$(basename springdata);

$DOCKER_CMD build -t ${REPO}-dev -f $CODE_DIR/docker/Dockerfile $CODE_DIR/docker;
$DOCKER_CMD create --name springdata ${REPO}-dev;
$DOCKER_CMD cp springdata:/app/target/${jar_name} $CODE_DIR/docker/${jar_name}
$DOCKER_CMD rm springdata;
$DOCKER_CMD build -t ${REPO}:${COMMIT} -f $CODE_DIR/docker/Dockerfile-release $CODE_DIR/docker;
