#!/bin/sh
# -----------------------------------------------------------------------------
# Run Script for the CATALINA Server
#

DIR=`dirname $0`
TCSERVER_DIR="${DIR}/tcServer-6.0"

MODE=$2

if [ "$MODE" = "" ] ; then
	MODE="run"
fi

if [ -z "$1" ]; then 
    echo "ERROR Please provide name of tcServer instance to start as parameter"
    exit 1
fi

cd ${TCSERVER_DIR}
export INSTANCE_NAME="$1"
exec "./tcruntime-ctl.sh" $1 $MODE
