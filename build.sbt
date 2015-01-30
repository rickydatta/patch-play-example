name := """simple-rest-scala"""

version := "1.0-SNAPSHOT"

resolvers += "krasserm at bintray" at "http://dl.bintray.com/krasserm/maven"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka_2.10" % "0.8.2-beta",
  "com.101tec" % "zkclient" % "0.3",
  "com.softwaremill" %% "reactive-kafka" % "0.2.0",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "postgresql" % "postgresql" % "9.1-901.jdbc4"
)