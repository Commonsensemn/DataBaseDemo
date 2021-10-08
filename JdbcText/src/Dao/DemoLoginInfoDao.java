package Dao;

import Bean.LoginInfoBean;

import java.sql.*;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/5 15:26 星期二
 * @ClassName: DemoLoginInfoDao
 * @ClassDescription: loginInfoDao
 */

public class DemoLoginInfoDao implements DemoLoginInfoDaoInterface {


    @Override
    public boolean saveLoginInfo(LoginInfoBean loginInfoBean, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeQuery("use demo");
        statement.executeUpdate("insert into demo.logininfo values (" + "'" + loginInfoBean.getId() + "','" + loginInfoBean.getLoginName() + "','" + loginInfoBean.getPassword() + "'" + ")");
        ResultSet resultSet = statement.executeQuery("select * from demo.logininfo where id = " + loginInfoBean.getId() + "");
        while (resultSet.next()){
            if (loginInfoBean.getId().equals(resultSet.getInt("id"))){
                return true;
            }
        }
        return false;
    }

    @Override
    public LoginInfoBean findLoginInfo(Integer id, Connection connection) {
        return null;
    }

    @Override
    public LoginInfoBean findLoginInfo(String loginName, String password, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeQuery("use demo");
        ResultSet resultSet = statement.executeQuery("select * from demo.logininfo where loginName = " + "'" + loginName + "'" + "and passWorld = " + "'" + password + "'" + " ");
        LoginInfoBean loginInfoBean = new LoginInfoBean();
        while (resultSet.next()){
            loginInfoBean.setId(resultSet.getInt("id"));
            loginInfoBean.setLoginName(resultSet.getString("loginName"));
            loginInfoBean.setPassword(resultSet.getString("passWorld"));
            return loginInfoBean;
        }
        return null;
    }
}
