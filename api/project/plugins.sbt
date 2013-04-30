addSbtPlugin("de.johoop" % "sbt-testng-plugin" % "2.0.3")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")


resolvers += Classpaths.typesafeResolver

resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

addSbtPlugin("reaktor" % "sbt-scct" % "0.2-SNAPSHOT")