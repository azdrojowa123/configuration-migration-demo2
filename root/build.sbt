ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % Test
    )
  )

lazy val mod = (project in file("mod"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
      "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % Test
    )
  )


