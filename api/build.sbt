organization := "com.xiaoguangchen"

name := "api"

version := "0.1.0-SNAPSHOT"

publish := false

scalaVersion  := "2.10.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

//only for scala-2.9.2
//scalacOptions += "-Ydependent-method-types"

seq(testNGSettings:_*)

testNGVersion         := "6.4"

testNGOutputDirectory := "target/testng"

testNGParameters      := Seq()

testNGSuites          := Seq("api/src/test/resources/testng.xml")

seq(ScctPlugin.instrumentSettings : _*)

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Eligosource Releases" at "http://repo.eligotech.com/nexus/content/repositories/eligosource-releases"
)

libraryDependencies ++= Seq(
//scala-2.10.0
  "com.typesafe.akka"   %%  "akka-actor"             % "2.1.2"
  ,"org.testng"                % "testng"              % "6.8"
  , "org.joda"                 % "joda-convert"        % "1.3"
  ,"joda-time"                 % "joda-time"           % "2.1"
)



