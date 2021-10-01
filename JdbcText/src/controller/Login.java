package controller;

import java.util.Date;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 15:39 星期五
 * @ClassName: Login
 * @ClassDescription: 这是测试的类
 */
public class Login implements UserControllerInterface {

    @Override
    public boolean login(String loginName, String password) {
        return false;
    }

    @Override
    public boolean createUser(String loginName, String password, String userName, Integer age, String sex, Date birthTime, String phoneNumber) {
        return false;
    }


}
