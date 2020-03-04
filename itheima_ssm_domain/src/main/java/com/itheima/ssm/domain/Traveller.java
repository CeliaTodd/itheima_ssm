package com.itheima.ssm.domain;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Motto:Let persistence become a habit, let giving up become a luxury
 * User:Todd
 * Date:2020/3/2
 * Time:17:14
 */
//旅客实体类
public class Traveller implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String phoneNum;
    private int credentialsType;//证件类型 0身份证 1护照 2军官证
    private String credentialsTypeStr;
    private String credentialsNum;
    private int travellerType;//旅客类型(人群) 0 成人 1 儿童
    private String travellerTypeStr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(int credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsTypeStr() {
        //证件类型 0身份证 1护照 2军官证
        if (credentialsType == 0) {
            credentialsTypeStr = "身份证";
        } else if (credentialsType == 1) {
            credentialsTypeStr = "护照";
        }
        if (credentialsType == 2) {
            credentialsTypeStr = "军官证";
        }
        return credentialsTypeStr;
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public int getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(int travellerType) {
        this.travellerType = travellerType;
    }

    public String getTravellerTypeStr() {
        //旅客类型(人群) 0 成人 1 儿童
        if (travellerType == 0) {
            travellerTypeStr = "成人";
        }
        if (travellerType == 1) {
            travellerTypeStr = "儿童";
        }
        return travellerTypeStr;
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }

/*    @Override
    public String toString() {
        return "Traveller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", credentialsType=" + credentialsType +
                ", credentialsTypeStr='" + credentialsTypeStr + '\'' +
                ", credentialsNum='" + credentialsNum + '\'' +
                ", travellerType=" + travellerType +
                ", travellerTypeStr='" + travellerTypeStr + '\'' +
                '}';
    }*/
}
