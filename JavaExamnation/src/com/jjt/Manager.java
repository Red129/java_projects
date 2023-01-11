package com.jjt;
/**
 * 管理员类，存储了管理员的用户名与密码
 */
public class Manager {



    /**
     * 设置一个默认的管理员账号
     */
    private String username = "jjt";
    private String password = "123456";
    public Manager() {
    }

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
