ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion :="2.12.12"

lazy val root = (project in file("."))
  .settings(
    name := "HelloWorldFlink"
  )



// https://mvnrepository.com/artifact/org.apache.flink/flink-scala
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.13.2" % "provided"
// https://mvnrepository.com/artifact/org.apache.flink/flink-core
libraryDependencies += "org.apache.flink" % "flink-core" % "1.13.2" % "provided"


