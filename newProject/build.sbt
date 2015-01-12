name := """newProject"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.31",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.scalatestplus" %% "play" % "1.2.0" % "test",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.h2database" % "h2" % "1.3.170",
  "com.typesafe.slick" %% "slick" % "2.0.2",
  "com.typesafe.play" %% "play-slick" % "0.7.0-M1"
)
