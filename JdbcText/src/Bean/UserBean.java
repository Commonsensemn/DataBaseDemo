package Bean;

import java.time.LocalDate;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 23:56 星期五
 * @ClassName: UserBean
 * @ClassDescription: user bean
 */
public class UserBean {
    private Integer userid;
    private String username;
    private Integer age;
    private String sex;
    private LocalDate birthtime;
    private String phonenumber;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public LocalDate getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(LocalDate birthtime) {
        this.birthtime = birthtime;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
