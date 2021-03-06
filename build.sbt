organization := "de.dfki.cps"
name := "specific-sysml"
version := "0.2.11"
scalaVersion := "2.12.8"
scalaVersion in ThisBuild := "2.12.8"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayOrganization := Some("dfki-cps")

scalacOptions := Seq("-deprecation")

crossScalaVersions := Seq("2.11.12","2.12.8")

resolvers += Resolver.bintrayRepo("dfki-cps", "maven")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
  "org.scalatest" %% "scalatest" % "3.0.0+" % "test"
)

enablePlugins(JavaAppPackaging)

// JSON Library
libraryDependencies += "io.spray" %%  "spray-json" % "1.3.5"