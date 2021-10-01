package Bean;

import java.util.Date;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 23:56 星期五
 * @ClassName: UserBean
 * @ClassDescription: 这是测试的类
 */
public class UserBean {
    private String userid;
    private String username;
    private Integer age;
    private String sex;
    private Date birthtime;
    private String phonenumber;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(Date birthtime) {
        this.birthtime = birthtime;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
