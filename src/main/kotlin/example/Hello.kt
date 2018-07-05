package example

import org.h2.tools.Server
import java.sql.DriverManager

private val DBNAME = "mydb"

fun main(args: Array<String>) {
    Class.forName("org.h2.Driver")

    val conn = DriverManager.getConnection("jdbc:h2:mem:$DBNAME", "sa", "sa") // (2)
    val stmt = conn.createStatement()
    with(stmt) {
        executeUpdate("create table mytbl(id int primary key, name varchar(255))")
        executeUpdate("insert into mytbl values(1, 'Hello')")
        executeUpdate("insert into mytbl values(2, 'World')")
    }

    val server = Server.createTcpServer().start()

    println("Server started and connection is open. url: ")
    println("jdbc:h2:" + server.getURL() + "/mem:" + DBNAME)

    Thread.sleep(Long.MAX_VALUE)

    server.stop()
}
