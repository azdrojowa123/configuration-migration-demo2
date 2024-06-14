ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

val root1 = ProjectRef(file("root"), "root")

lazy val cross3 = crossProject(JVMPlatform, JSPlatform)
  .build()

lazy val foo = (project in file("foo"))

lazy val mod = (project in file("mod"))
  .dependsOn(cross3.jvm, foo)

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    )
  )
  .dependsOn(root1, mod)






















//lazy val extend_newname = crossProject(JVMPlatform, JSPlatform)
//  .crossType(CrossType.Full)
//  .settings(
//    Compile/scalacOptions := Seq("-Ytasty-reader"),
//    //name := "group",
//    scalaVersion := "2.13.11",
//    //Test/trackInternalDependencies := NoTracking
//  )
//  .dependsOn(common % "runtime->compile")