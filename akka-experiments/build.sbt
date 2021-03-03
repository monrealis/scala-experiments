name := "akka-experiments"
version := "0.1"
scalaVersion := "2.13.5"
idePackagePrefix := Some("eu.vytenis.akka")

libraryDependencies ++=Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.13",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.13",
  "org.scalatest" %% "scalatest" % "3.2.5"
)