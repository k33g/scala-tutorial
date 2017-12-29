#!/bin/sh
java -Dsbt.ivy.home="../_ivy2" -Dsbt.global.base="../_sbt" -Dsbt.boot.directory="../_sbt/boot" -Xmx512M -jar -Dfile.encoding=UTF8 -Xss1M -XX:+CMSClassUnloadingEnabled ../sbt/bin/sbt-launch.jar "set offline := true" ~reStart
