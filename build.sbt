name := "dbmapper-macros"

organization := "com.github.njeuk"

description := "Scala Macros used by dbmapper"

version := "3.1"

scalaVersion := "2.12.3"

scalacOptions += "-feature"

publishMavenStyle := true

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

libraryDependencies ++= Seq(
  "com.github.mauricio" %% "postgresql-async" % "0.2.21",
  "org.scala-lang.modules" %% "scala-async" % "0.9.7",
  "org.scala-lang" % "scala-reflect" % "2.12.3",
  "com.vividsolutions" % "jts" % "1.13",
  "org.scalatest" % "scalatest_2.12" % "3.0.3" % "test"
)

