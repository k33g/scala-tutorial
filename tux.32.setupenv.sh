#!/bin/sh
# . tux.setupenv.sh

export JAVA_HOME=$(pwd)/jdk1.8.0_161-linux/java-linux
export PATH=$JAVA_HOME/bin:$PATH
echo "Java Home: $JAVA_HOME"
$JAVA_HOME/bin/java -version
