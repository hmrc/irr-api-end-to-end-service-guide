resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy2", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(
  Resolver.ivyStylePatterns
)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "3.9.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-distributables" % "2.2.0")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.19")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.3")

addSbtPlugin("com.beautiful-scala" % "sbt-scalastyle" % "1.5.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
