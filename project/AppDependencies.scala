import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {
  private lazy val bootStrapPlayVersion = "8.4.0"

  private lazy val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootStrapPlayVersion
  )

  private lazy val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc" %% "bootstrap-test-play-30" % bootStrapPlayVersion
  ).map(_ % Test)

  def apply(): Seq[ModuleID]           = compile ++ test
}
