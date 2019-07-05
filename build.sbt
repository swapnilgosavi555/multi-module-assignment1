name := "multi-module-assignment1"

version := "0.1"

scalaVersion := "2.13.0"

lazy val root= project in file(".")
lazy val dbOperation=project in file("dbOperation")
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"