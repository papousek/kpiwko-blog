#!/bin/bash
SCRIPT_DIR=`dirname $BASH_SOURCE`;
SCRIPT_DIR=`readlink -f $SCRIPT_DIR`;
export GIT_SSH=${SCRIPT_DIR}/git-ssh.sh;

mvn clean verify -Popenshift -Dtest=ShowcaseTest -Dopenshift.key.password=$1;
