scalaVersion := "2.11.1"

libraryDependencies += "org.apache.commons" % "commons-pool2" % "2.0"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11-RC1" % "test"

parallelExecution in Test := false
