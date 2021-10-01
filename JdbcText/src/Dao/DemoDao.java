package Dao;
import Bean.UserBean;
import Tools.JdbcConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 17:11 星期五
 * @ClassName: DemoDao
 * @ClassDescription: 这是测试的类
 */
public class DemoDao {
    public ResultSet demoLogin() throws Exception{
        Connection root = JdbcConstructor.getConnection();
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
        return null;
    }

    public UserBean findById(String id) {
        return null;
    }

    public UserBean find(UserBean userBean, String sql) {
        String phoneNum = userBean.getPhonenumber();
        return null;
    }
}
