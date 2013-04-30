import sbt._
import sbt.Configuration
import sbt.Keys._

object MyBuild extends Build {

    lazy val root = Project(id = "multiproject", base = file(".")) aggregate(api)
    lazy val core = Project(id = "core", base = file("core"))
    lazy val api = Project(id = "api", base = file("api")).dependsOn(core).aggregate(core)
}
