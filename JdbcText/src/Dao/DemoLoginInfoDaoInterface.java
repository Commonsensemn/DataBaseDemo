package Dao;

import Bean.LoginInfoBean;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/5 15:14 星期二
 * @ClassName: DemoLoginInfoDaoInterface
 * @ClassDescription: 这是测试的类
 */
public interface DemoLoginInfoDaoInterface {

    /**
     * 存储用户注册信息
     * @author: Common sense
     * @Date: 2021/10/6 21:02
     * @描述: 此方法会向loginInfo表存储用户的登录信息（非批量存储）
     * @param loginInfoBean LoginInfoBean
     * @param connection Connection
     * @return boolean
     * @throws SQLException 抛出的sql异常
     **/
    boolean saveLoginInfo(LoginInfoBean loginInfoBean, Connection connection) throws SQLException;

    LoginInfoBean findLoginInfo(Integer id, Connection connection);

    /**
     * 更具用户登录账户和密码判断用户是否存在
     * @author: Common sense
     * @Date: 2021/10/6 20:54
     * @描述: 次方法会通过用户的账号和密码去loginInfo表里查询用户的登录信息，以此来判断用户是否存在
     * @param loginName String
     * @param password String
     * @param connection Connection
     * @return Bean.LoginInfoBean
     * @throws SQLException 抛出的sql异常
     **/
    LoginInfoBean findLoginInfo(String loginName, String password, Connection connection) throws SQLException;

}
