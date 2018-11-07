#!/bin/sh

cd "$(dirname "$0")"

JARFILE=life-mail-service-0.0.1-SNAPSHOT-bootJar.jar

ps -ef | grep $JARFILE | grep -v grep | awk '{print $2}' | xargs kill -9

sleep 1

java -jar -Xmx512m -Xss512k $(pwd)/$JARFILE >  /dev/null 2>&1 &

jps
