import play.Project._

name := "Play_Cassandra"

version := "1.0"

playScalaSettings

// https://mvnrepository.com/artifact/com.datastax.cassandra/cassandra-driver-core
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.1.3"

// https://mvnrepository.com/artifact/com.datastax.cassandra/cassandra-driver-mapping
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-mapping" % "3.1.3"



