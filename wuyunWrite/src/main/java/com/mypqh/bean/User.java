package com.mypqh.bean;

public class User {
    int id;
    String userid;
    String password;
    int loginStat;//用户登录判断

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginStat() {
        return loginStat;
    }

    public void setLoginStat(int loginStat) {
        this.loginStat = loginStat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", loginStat=" + loginStat +
                '}';
    }
}
