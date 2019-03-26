import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "fizzbuzz-scala",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
