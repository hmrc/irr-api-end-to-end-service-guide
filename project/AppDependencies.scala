import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  private lazy val bootStrapPlayVersion = "6.4.0"
  private lazy val silencerVersion      = "1.7.9"

  private lazy val silencerDependencies: Seq[ModuleID] = Seq(
    compilerPlugin("com.github.ghik" % "silencer-plugin" % silencerVersion cross CrossVersion.full),
    "com.github.ghik" % "silencer-lib" % silencerVersion % Provided cross CrossVersion.full
  )

  private lazy val compile: Seq[ModuleID] =
    Seq(ws, "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion)

  private lazy val test: Seq[ModuleID]    = Seq(
    "org.pegdown"          % "pegdown"      % "1.6.0",
    "com.vladsch.flexmark" % "flexmark-all" % "0.62.2",
    "org.scalatest"       %% "scalatest"    % "3.2.13"
  ).map(_ % Test)

  def apply(): Seq[ModuleID]              = compile ++ silencerDependencies ++ test

}
