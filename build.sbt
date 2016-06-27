name := """akkademy-db-client"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.akkademy-db" %% "akkademy-db" % "0.0.1-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
