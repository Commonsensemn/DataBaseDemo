package server;

import Bean.LoginInfoBean;
import Bean.UserBean;
import Dao.DemoLoginInfoDao;
import Dao.DemoUserDao;
import Tools.JdbcConstructor;
import Tools.ToolsDay1;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 17:08 星期五
 * @ClassName: userServer
 * @ClassDescription: user server
 */
public class userServer implements UserServerInterface {

    @Override
    public boolean createUser(String loginName, String password, String userName, Integer age, String sex, LocalDate birthTime, String phoneNumber) {
        Integer idUser = ToolsDay1.randomNb();
        LoginInfoBean loginInfoBean = new LoginInfoBean();
        loginInfoBean.setLoginName(loginName);
        loginInfoBean.setId(idUser);
        loginInfoBean.setPassword(password);
        UserBean userBean = new UserBean();
        userBean.setUserid(idUser);
        userBean.setUsername(userName);
        userBean.setAge(age);
        userBean.setSex(sex);
        userBean.setBirthtime(birthTime);
        userBean.setPhonenumber(phoneNumber);
        Connection connection = JdbcConstructor.getConnection();
        try {
            assert connection != null;
            connection.setAutoCommit(false);
            DemoLoginInfoDao demoLoginInfoDao = new DemoLoginInfoDao();
            DemoUserDao demoUserDao = new DemoUserDao();
            boolean b = demoLoginInfoDao.saveLoginInfo(loginInfoBean, connection);
            boolean b1 = demoUserDao.saveUser(userBean, connection);
            if (!b){
                connection.rollback();
            }
            if (!b1){
                connection.rollback();
            }
            connection.commit();
            JdbcConstructor.destoryConnection();
            return true;
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean login(String loginName, String password) {
        Connection connection = JdbcConstructor.getConnection();
        try {
            connection.setAutoCommit(false);
            DemoLoginInfoDao demoLoginInfoDao = new DemoLoginInfoDao();
            LoginInfoBean loginInfo = demoLoginInfoDao.findLoginInfo(loginName, password, connection);
            if (((null) == loginInfo.getId())){
                return false;
            }
            JdbcConstructor.destoryConnection();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
