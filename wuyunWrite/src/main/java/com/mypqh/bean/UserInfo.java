package com.mypqh.bean;

import java.util.Arrays;

public class UserInfo {
    int id;
    String userid;//用户名
    byte[] tximg;//头像
    String birth ; //用户生日
    String mailBox;//后期验证邮箱
    String signDate;//加入时间
    String signLog;//用户签名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userid;
    }

    public void setUserId(String userId) {
        this.userid = userId;
    }

    public byte[] getTximg() {
        return tximg;
    }

    public void setTximg(byte[] tximg) {
        this.tximg = tximg;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getSignLog() {
        return signLog;
    }

    public void setSignLog(String signLog) {
        this.signLog = signLog;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userId='" + userid + '\'' +
                ", tximg=" + Arrays.toString(tximg) +
                ", birth='" + birth + '\'' +
                ", mailBox='" + mailBox + '\'' +
                ", signDate='" + signDate + '\'' +
                ", signLog='" + signLog + '\'' +
                '}';
    }
}
