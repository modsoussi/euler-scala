import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .aggregate(problems)
  .dependsOn(problems)
  .settings(
    name := "euler",
    libraryDependencies += scalaTest % Test
  )

lazy val problems = (project in file("problems"))
  .settings(
    name := "problems",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
