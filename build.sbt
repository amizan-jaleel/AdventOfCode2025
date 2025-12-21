ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.17"

lazy val root = (project in file("."))
  .settings(
    name := "AdventOfCode2025"
  )

root / libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "4.23.0"
)

root / Test / scalacOptions ++= Seq(
  "-Yrangepos"
)