name := "Lift 3.0 starter template"

version := "0.1.0"

organization := "$organization$"

scalaVersion := "2.12.3"

resolvers ++= Seq(
  "snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
  "staging"       at "https://oss.sonatype.org/content/repositories/staging",
  "releases"      at "https://oss.sonatype.org/content/repositories/releases"
)

enablePlugins(JettyPlugin)

unmanagedResourceDirectories in Test += baseDirectory.value / "src/main/webapp"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "$lift_version$"
  Seq(
    "net.liftweb"       %% "lift-webkit"            % liftVersion,
    "ch.qos.logback"    % "logback-classic"         % "1.2.3",
    "javax.servlet"     % "javax.servlet-api"       % "3.0.1"            % "provided"
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")
