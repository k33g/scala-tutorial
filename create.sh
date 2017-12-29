#!/bin/sh

# ./create.sh <project_name> <package_name>

# === create a Scala Project ===
mkdir $1
cd $1
mkdir -p src/{main,test}/{java,resources,scala}
mkdir lib project
mkdir -p src/main/scala/$2
mkdir -p src/test/scala/$2

# --- generate README.md ---
cat > README.md << EOF
# $1

EOF


# --- generate source code ---
cat > src/main/scala/$2/Hello.scala << EOF
package $2

object Hello extends App {
  println("👋 🌍")
}
EOF

# --- generate test code ---
cat > src/test/scala/$2/HelloTest.scala << EOF
package $2

import org.scalatest.FunSuite

class HelloTest extends FunSuite {
  test("test something") {
      assert(42 === 42)
  }
}
EOF

# --- add plugin ---
cat > project/plugin.sbt << EOF
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")
EOF

# --- add build.sbt ---
cat > build.sbt << EOF
name := "$1"
version := "1.0"
scalaVersion := "2.12.4"
name := "$1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
EOF

# --- generate "offline" run script ---
cat > run.sh << EOF
#!/bin/sh
java -Dsbt.ivy.home="../_ivy2" -Dsbt.global.base="../_sbt" -Dsbt.boot.directory="../_sbt/boot" -Xmx512M -jar -Dfile.encoding=UTF8 -Xss1M -XX:+CMSClassUnloadingEnabled ../sbt/bin/sbt-launch.jar "set offline := true" ~reStart
EOF
chmod +x *.sh

# --- generate "offline" run tests ---
cat > tests.sh << EOF
#!/bin/sh
java -Dsbt.ivy.home="../_ivy2" -Dsbt.global.base="../_sbt" -Dsbt.boot.directory="../_sbt/boot" -Xmx512M -jar -Dfile.encoding=UTF8 -Xss1M -XX:+CMSClassUnloadingEnabled ../sbt/bin/sbt-launch.jar "set offline := true" test
EOF
chmod +x *.sh


