import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection
{
    public Connection connection()
    {
        Connection conn = null;
        try
        {
            //初始化驱动类com.mysql.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_system?characterEncoding=UTF-8", "root", "123123");
            //该类就在 mysql-connector-java-5.0.8-bin.jar中,如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}
