ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val common = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Full).settings(
  )

lazy val extend = crossProject(JVMPlatform, JSPlatform).crossType(CrossType.Full).dependsOn(common % "compile->compile;test->test")

lazy val root = (project in file(".")).dependsOn(common.jvm, extend.jvm)
  .settings(
    name := "crossProjectModules"
  )
