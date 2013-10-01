addSbtPlugin("de.johoop" % "sbt-testng-plugin" % "2.0.3")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.6")


libraryDependencies ++= Seq(
  "com.github.siasia" %% "xsbt-web-plugin" % "0.12.0-0.2.11.1"
)

addSbtPlugin("com.github.scct" % "sbt-scct" % "0.2")
