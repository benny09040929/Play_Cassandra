package Model

import com.datastax.driver.core.querybuilder.QueryBuilder
import com.datastax.driver.core.Session

/**
 * Created by TB690275 on 2017/2/7.
 */
object loginModel {
  case class user(name:String,password:String)

  object loginModel{
    val KEYSPACE = "playlist"
    val USER_TABLE ="users"

    def authenticate(name:String,password:String,createSession:Session): Boolean= {

      val query_by_user = QueryBuilder.select().from(KEYSPACE,USER_TABLE).where(QueryBuilder.eq("name",name))

      val resultByUser = createSession.executeAsync(query_by_user)

      val data = resultByUser.get().one()

      createSession.closeAsync()

      if (data==null) {
        println("check username is not null")
        true
      }
      else {
        if (name.equals(data.getString("name")) && password.equals(data.getString("password"))) {
          println("success")
          false
        }
        else{
          println("username and password fail")
          true
        }
      }
    }
  }
}
