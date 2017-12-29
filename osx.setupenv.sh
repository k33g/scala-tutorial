#!/bin/sh
# . osx.setupenv.sh

export JAVA_HOME=$(pwd)/jdk1.8.0_151-osx/java-osx
export PATH=$JAVA_HOME/bin:$PATH
echo "Java Home: $JAVA_HOME"
$JAVA_HOME/bin/java -version
