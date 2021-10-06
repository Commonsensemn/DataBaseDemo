package server;

import java.time.LocalDate;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 23:09 星期五
 * @ClassName: UserServerInterface
 * @ClassDescription: user server 功能规范接口
 */
public interface UserServerInterface {

    /**
     * 用户注册接口
     * @author: Common sense
     * @Date: 2021/10/5 14:07
     * @描述: 此接口会注册用户信息，然后返回是否注册成功 true/false
     * @param loginName String 登录名
     * @param password String 登录密码
     * @param userName String 用户名
     * @param age Integer 用户年龄
     * @param sex String 用户性别
     * @param birthTime Date 用户出生年月
     * @param phoneNumber String 用户电话号码
     * @return boolean 返回用户是否注册成功的判断值
     **/
    boolean createUser(String loginName, String password, String userName, Integer age, String sex, LocalDate birthTime, String phoneNumber);

    /**
     * 用户登录接口
     * @author: Common sense
     * @Date: 2021/10/5 14:17
     * @描述: 此接会查询用户是否存在，然后返回是否存在 true/false
     * @param loginName String
     * @param password String
     * @return boolean
     **/
    boolean login(String loginName, String password);

}
