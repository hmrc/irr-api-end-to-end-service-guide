val appName = "irr-api-end-to-end-service-guide"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(PlayScala, SbtDistributablesPlugin)
  // To resolve a bug with version 2.x.x of the scoverage plugin - https://github.com/sbt/sbt/issues/6997
  .settings(libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always)
  .settings(
    libraryDependencies ++= AppDependencies(),
    majorVersion := 0,
    scalaVersion := "2.13.11",
    scalacOptions += "-Wconf:src=routes/.*:s"
  )

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt Test/scalafmt")
addCommandAlias("scalastyleAll", "all scalastyle Test/scalastyle")
