package bean;

import java.util.Date;

public class User {
    int loginStat;//用户登录判断
    String uame;
    String password;
    Date uDateIn;//用户加入日期

    public int getLoginStat() {
        return loginStat;
    }

    public void setLoginStat(int loginStat) {
        this.loginStat = loginStat;
    }

    public String getUame() {
        return uame;
    }

    public void setUame(String uame) {
        this.uame = uame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getuDateIn() {
        return uDateIn;
    }

    public void setuDateIn(Date uDateIn) {
        this.uDateIn = uDateIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginStat=" + loginStat +
                ", uame='" + uame + '\'' +
                ", password='" + password + '\'' +
                ", uDateIn=" + uDateIn +
                '}';
    }
}
