package controllers

import com.datastax.driver.core
import com.datastax.driver.core.{QueryOptions, Cluster}
import play.api.mvc.Session

/**
 * Created by TB690275 on 2017/2/3.
 */
trait Cassandra {

  object CassandraData {


    def createSession: core.Session = {
      val cluster = Cluster.builder().addContactPoint("192.168.56.130").withCredentials("benny", "09040929").withPort(9042).withQueryOptions(new QueryOptions().setConsistencyLevel(QueryOptions.DEFAULT_CONSISTENCY_LEVEL)).build
      val session = cluster.connect()
      session
    }
  }

}





