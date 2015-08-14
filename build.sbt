
lazy val commonSettings = Seq(
  organization := "de.bwaldvogel",
  version := "1.95",
  scalaVersion := "2.11.7",
  scalacOptions := Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked")
)

val powermockVersion = "1.6.1"

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "liblinear",
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "junit" % "junit" % "4.12" % "test",
      "org.easytesting" % "fest-assert" % "1.4",
      "org.powermock" % "powermock-module-junit4" % powermockVersion,
      "org.powermock" % "powermock-api-mockito" % powermockVersion
    )
  )
