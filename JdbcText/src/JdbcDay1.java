import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 3:38 星期五
 * @ClassName: JdbcDay1
 * @ClassDescription: 这是测试的类
 */
public class JdbcDay1 {
    public static void main(String[] args) throws Exception{
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:8083/MySQL", "root", "root");
        Statement statement = root.createStatement();
        statement.executeQuery("use demo");
        ResultSet resultSet = statement.executeQuery("select * from courses");
        while (resultSet.next()){
            System.out.println(resultSet.getString("cno"));
            System.out.println(resultSet.getString("cname"));
            System.out.println(resultSet.getString("tno"));
        }
        resultSet.close();
        statement.close();
        root.close();
    }
}
