import AssemblyKeys._

assemblySettings

organization := "com.xiaoguangchen"

name := "multiproject"

version := "0.1.0-SNAPSHOT"

publish := false

scalaVersion  := "2.10.1"


resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype Snapshots"  at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases"   at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
// scala-2.10.x
  "com.typesafe.akka"    %% "akka-actor"                 % "2.1.2"
  ,"com.typesafe.akka"    %  "akka-testkit_2.10.0-RC1"    % "2.1.0-RC1" % "test"
  ,"org.testng"                % "testng"                 % "6.8"
  , "org.joda"                 % "joda-convert"           % "1.3"
  ,"joda-time"                 % "joda-time"              % "2.1"
  , "mysql"                    % "mysql-connector-java"   % "5.1.22"
)

