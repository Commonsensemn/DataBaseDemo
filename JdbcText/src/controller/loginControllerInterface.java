package controller;

import java.time.LocalDate;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 18:25 星期五
 * @ClassName: loginControllerInterface
 * @ClassDescription: login功能规范接口
 */
public interface loginControllerInterface {

    /**
     * 用于用户登录
     * @author: Common sense
     * @Date: 2021/10/1 18:38
     * @描述: 此方法会查询用户是否存在，然后返回是否存在 true/false
     * @param loginName String 用户登录名
     * @param password String 用户密码
     * @return boolean 返回登录是否的code
     **/
    boolean login(String loginName, String password);

    /**
     * 用于用户注册
     * @author: Common sense
     * @Date: 2021/10/1 18:58
     * @描述: 此方法会注册用户信息，然后返回是否注册成功 true/false
     * @param loginName String
     * @param password String
     * @param userName String
     * @param age Integer
     * @param sex String
     * @param birthTime Date
     * @param phoneNumber String
     * @return boolean 用户是否注册成功——code
     **/
    boolean createUser(String loginName, String password, String userName, Integer age, String sex, LocalDate birthTime, String phoneNumber);

}
