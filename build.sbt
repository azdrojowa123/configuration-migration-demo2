ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

val root1 = ProjectRef(file("root"), "root")

lazy val cross3 = crossProject(JVMPlatform, JSPlatform)
  .build()

lazy val mod = (project in file("mod"))
  .settings(
    libraryDependencies ++= Seq(
      "org.junit.jupiter" % "junit-jupiter-api" % "5.10.2" % Test,
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )

lazy val root = (project in file("."))
  .settings(
    name := "root",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )
  .dependsOn(root1, cross3.jvm)
























//lazy val extend_newname = crossProject(JVMPlatform, JSPlatform)
//  .crossType(CrossType.Full)
//  .settings(
//    Compile/scalacOptions := Seq("-Ytasty-reader"),
//    //name := "group",
//    scalaVersion := "2.13.11",
//    //Test/trackInternalDependencies := NoTracking
//  )
//  .dependsOn(common % "runtime->compile")