#!/bin/bash
SCRIPT_DIR=`dirname $BASH_SOURCE`;
SCRIPT_DIR=`readlink -f $SCRIPT_DIR`;
PRIVATE_KEY_FILE=${SCRIPT_DIR}/src/test/resources/richfaces-qa-jenkins-id_rsa

exec ssh -i "$PRIVATE_KEY_FILE" "$@";
