scalaVersion := "2.10.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies += "com.typesafe.akka" %% "akka-kernel"  % "2.2.0"

libraryDependencies += "com.typesafe.akka" %% "akka-camel"  % "2.2.0"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.7" % "runtime"
