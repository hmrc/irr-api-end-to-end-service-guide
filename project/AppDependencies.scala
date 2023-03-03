import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  private lazy val bootStrapPlayVersion = "7.14.0"

  private lazy val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion
  )

  private lazy val test: Seq[ModuleID] = Seq(
    "com.vladsch.flexmark" % "flexmark-all"           % "0.62.2",
    "org.scalatest"       %% "scalatest"              % "3.2.15",
    "uk.gov.hmrc"         %% "bootstrap-test-play-28" % bootStrapPlayVersion
  ).map(_ % Test)

  def apply(): Seq[ModuleID]           = compile ++ test
}
