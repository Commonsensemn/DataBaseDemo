package controller;

import java.util.Date;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 18:25 星期五
 * @ClassName: UserControllerInterface
 * @ClassDescription: 这是测试的类
 */
public interface UserControllerInterface {

    /**
     * 用于用户登录
     * @author: Common sense
     * @Date: 2021/10/1 18:38
     * @描述: 用户登录
     * @param loginName String 用户登录名
     * @param password String 用户密码
     * @return boolean 返回登录是否的code
     **/
    boolean login(String loginName, String password);

    /**
     * 用于用户注册
     * @author: Common sense
     * @Date: 2021/10/1 18:58
     * @描述: 用户注册
     * @param loginName String
     * @param password String
     * @param userName String
     * @param age Integer
     * @param sex String
     * @param birthTime Date
     * @param phoneNumber String
     * @return boolean 用户是否注册成功——code
     **/
    boolean createUser(String loginName, String password,String userName, Integer age, String sex, Date birthTime, String phoneNumber);

}
