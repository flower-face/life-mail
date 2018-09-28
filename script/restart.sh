#!/bin/sh

cd "$(dirname "$0")"

DIR=$(pwd)

export JAVA_TOOL_OPTIONS="$JAVA_TOOL_OPTIONS -Dfile.encoding=UTF-8"

classPath=$DIR/life-mail-web-0.0.1-SNAPSHOT.jar

mainClass=com.mail.MainApplication

shLogPath=$DIR/restart.log

jps | grep MainApplication | awk "{print \$1}" | xargs kill -9 >/dev/null 2>&1

nohup java -cp "$classPath" "$mainClass" -Xmx4096m -Dfile.encoding=UTF-8 >"$shLogPath" &

jps
