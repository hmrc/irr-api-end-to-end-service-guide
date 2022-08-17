import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin.publishingSettings

val appName = "irr-api-end-to-end-service-guide"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtAutoBuildPlugin, SbtGitVersioning, SbtDistributablesPlugin, SbtArtifactory)
  .settings(
    libraryDependencies ++= AppDependencies(),
    majorVersion := 0,
    scalaVersion := "2.12.16"
  )
  .settings(
    publishingSettings: _*
  )
  .settings(
    resolvers += Resolver.jcenterRepo
  )

scalacOptions ++= Seq(
  "-P:silencer:globalFilters=Unused import",
  "-feature"
)

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt test:scalafmt")
addCommandAlias("scalastyleAll", "all scalastyle test:scalastyle")
