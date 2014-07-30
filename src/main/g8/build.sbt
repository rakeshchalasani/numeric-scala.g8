name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.7" % "test"
)

// Numeric and visualization libraries
libraryDependencies  ++= Seq (
  "org.scalanlp" % "breeze_2.10" % "0.8.1",
  "org.scalanlp" % "nak" % "1.2.1",
  "org.jfree" % "jfreechart" % "1.0.14"
)

resolvers ++= Seq(
	"Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import $organization$.$name;format="lower,word"$._"
