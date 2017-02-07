package controllers
/**
 * Created by TB690275 on 2017/2/6.
 */

object CassandraInfo {
  def main (args: Array[String]): Unit = {

    val row = CassandraData.createSession.execute("select cluster_name, release_version from system.local").one()
    val cassandraVersion = row.getString("release_version")
    val cassandraName = row.getString("cluster_name")
    println(cassandraName+","+cassandraVersion)

  }
}