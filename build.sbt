name := "scala-message-broker"

version := "0.1"

scalaVersion := "2.13.8"

val AkkaVersion = "2.6.14"
val AkkaHttpVersion = "10.1.11"
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "3.0.4",
  "com.lightbend.akka" %% "akka-stream-alpakka-udp" % "2.0.2",
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0",
  "com.lihaoyi" %% "upickle" % "1.3.9",
  "com.typesafe.play" %% "play-json" % "2.9.2",
  "io.netty" % "netty-all" % "4.0.4.Final"
  )
