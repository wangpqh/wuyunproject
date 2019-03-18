package bean;

import java.util.Date;

public class UserInfo {
    String uId;//用户名
    String uSign;//用户签名
    Date uBirth ; //用户生日
    String mailBox;//后期验证邮箱

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuSign() {
        return uSign;
    }

    public void setuSign(String uSign) {
        this.uSign = uSign;
    }

    public Date getuBirth() {
        return uBirth;
    }

    public void setuBirth(Date uBirth) {
        this.uBirth = uBirth;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uId='" + uId + '\'' +
                ", uSign='" + uSign + '\'' +
                ", uBirth=" + uBirth +
                ", mailBox='" + mailBox + '\'' +
                '}';
    }
}
