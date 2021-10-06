package Dao;

import Bean.UserBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/5 15:26 星期二
 * @ClassName: DemoUserDao
 * @ClassDescription: userDAO
 */
public class DemoUserDao implements DemoUserDaoInterface {

    @Override
    public UserBean findById(Integer id, Connection connection) {
        return null;
    }

    @Override
    public boolean saveUsers(HashMap<Integer, UserBean> userBean, Connection connection) {
        return false;
    }

    @Override
    public boolean saveUser(UserBean userBean, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeQuery("use demo");
        statement.executeUpdate("insert into user values (" + "'" + userBean.getUserid() + "','" + userBean.getUsername() + "','" + userBean.getAge() + "','" + userBean.getSex() + "','" + userBean.getBirthtime() + "','" + userBean.getPhonenumber() + "'" + ")");
        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()){
            if (userBean.getUserid().equals(resultSet.getInt("user_id"))){
                return true;
            }
        }
        return false;
    }
}
