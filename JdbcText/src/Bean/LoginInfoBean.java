package Bean;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/5 15:18 星期二
 * @ClassName: LoginInfoBean
 * @ClassDescription: login info bean
 */
public class LoginInfoBean {
    Integer id;
    String loginName;
    String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
