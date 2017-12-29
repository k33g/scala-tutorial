echo off
set JAVA_HOME=%cd%\jdk1.8.0_151-windows-x64\java-windows
set PATH=%PATH%;%JAVA_HOME%
%JAVA_HOME%\bin\java -version
echo on
