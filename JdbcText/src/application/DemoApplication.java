package application;

import controller.Login;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 18:19 星期五
 * @ClassName: DemoApplication
 * @ClassDescription: JDBC Text Application
 */
public class DemoApplication {

    Login login = new Login();

    public static void main(String[] args) {
        DemoApplication demoApplication = new DemoApplication();
        System.out.println(demoApplication.login());
//        System.out.println(demoApplication.createUser());
    }


    public String login(){
        System.out.println("请输入您的账户：");
        String loginName = new Scanner(System.in).next();
        System.out.println("请输入您的密码：");
        String password = new Scanner(System.in).next();
        boolean code = login.login(loginName, password);
        if (!code){
          return "您登录失败";
        }
        return "您登录成功";
    }

    public String createUser(){
        try {
            System.out.println("请输入您的账户：");
            String loginName = new Scanner(System.in).next();
            System.out.println("请输入您的密码：");
            String password = new Scanner(System.in).next();
            System.out.println("请输入您的用户名：");
            String userName = new Scanner(System.in).next();
            System.out.println("请输入您的年龄：");
            Integer age = new Scanner(System.in).nextInt();
            System.out.println("请输入您的性别");
            String sex = new Scanner(System.in).next();
            System.out.println("请输入您的出生日期");
            LocalDate birthTime = LocalDate.parse(new Scanner(System.in).next());
            System.out.println("请输入您的电话号码");
            String phoneNumber = new Scanner(System.in).next();
            boolean code = login.createUser(loginName, password, userName, age, sex, birthTime, phoneNumber);
            if (!code){
                return "创建异常";
            }
        } catch (NullPointerException e){
            e.printStackTrace();
            return "时间如期为空";
        }
        return "创建成功";
    }

}
