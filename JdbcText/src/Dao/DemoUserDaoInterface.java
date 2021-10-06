package Dao;

import Bean.UserBean;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/5 14:58 星期二
 * @ClassName: DemoUserDaoInterface
 * @ClassDescription: user表的dao 功能规范接口
 */
public interface DemoUserDaoInterface {

    UserBean findById(Integer id, Connection connection);

    boolean saveUsers(HashMap<Integer,UserBean> userBean, Connection connection);

    /**
     * 存储用户信息
     * @author: Common sense
     * @Date: 2021/10/6 20:23
     * @描述: 此方法向user表中存储用户信息，（非批量存储）
     * @param userBean UserBean
     * @param connection Connection
     * @return boolean
     * @throws SQLException 抛出sql的异常
     **/
    boolean saveUser(UserBean userBean, Connection connection) throws SQLException;

}
