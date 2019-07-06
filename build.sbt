name := "multi-module-assignment1"

version := "0.1"

scalaVersion in ThisBuild := "2.13.0"


libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"
lazy val root= (project in file("."))
  .aggregate(dboperation,useroperation,entity)
  .dependsOn(dboperation,useroperation,entity)
  .settings(name := "root")

lazy val dboperation = (project in file("dboperation"))
  .aggregate(entity)
  .dependsOn(entity)
    .settings(name :="dboperation")
lazy val entity=(project in file("entity"))
  .settings(name := "entity")

lazy val useroperation =(project in file("useroperation"))
  .aggregate(dboperation)
  .dependsOn(dboperation)
  .settings(name := "useroperation")
