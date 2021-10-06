package controller;

import server.userServer;
import java.time.LocalDate;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 15:39 星期五
 * @ClassName: Login
 * @ClassDescription: login控制器
 */
public class Login implements loginControllerInterface {

    @Override
    public boolean login(String loginName, String password) {
        if ( "".equals(loginName) || null == loginName){
            return false;
        }
        if ( "".equals(password) || null == password){
            return false;
        }
        userServer userServer = new userServer();
        return userServer.login(loginName, password);
    }

    @Override
    public boolean createUser(String loginName, String password, String userName, Integer age, String sex, LocalDate birthTime, String phoneNumber) {
        if ( "".equals(loginName) || null == loginName){
            return false;
        }
        if ( "".equals(password) || null == password ){
            return false;
        }
        if ( "".equals(userName) || null == userName){
            return false;
        }
        userServer userServer = new userServer();
        return userServer.createUser(loginName, password, userName, age, sex, birthTime, phoneNumber);
    }

}
