lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-js-samples",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % Test
  )

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
