ThisBuild / scalaVersion := "3.5.0"
ThisBuild / majorVersion := 0

lazy val microservice = Project("irr-api-end-to-end-service-guide", file("."))
  .enablePlugins(PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies(),
    scalacOptions += "-Wconf:src=routes/.*:s"
  )

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt Test/scalafmt")
