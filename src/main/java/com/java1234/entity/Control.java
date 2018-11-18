package com.java1234.entity;

import java.util.Date;

/**
 * 请求配置实体
 */
public class Control {
    private Integer id;//用户编号
    private String requestAim;//请求目的
    private String account;//账号
    private String password;//密码
    private String tellphone;//电话号码
    private Date requestTime;//请求时间
    private String requestLocation;//地址
    private String  identity;//身份
    private String work;//工作
    private String age;//年龄
    private String sex;//性别
    private String nickName;//昵称
    private Float reputation;//信誉度

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestAim() {
        return requestAim;
    }

    public void setRequestAim(String requestAim) {
        this.requestAim = requestAim;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTellphone() {
        return tellphone;
    }

    public void setTellphone(String tellphone) {
        this.tellphone = tellphone;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestLocation() {
        return requestLocation;
    }

    public void setRequestLocation(String requestLocation) {
        this.requestLocation = requestLocation;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Float getReputation() {
        return reputation;
    }

    public void setReputation(Float reputation) {
        this.reputation = reputation;
    }

    public Control() {
    }

    public Control(Integer id, String requestAim, String account, String password, String tellphone, Date requestTime, String requestLocation, String identity, String work, String age, String sex, String nickName, Float reputation) {
        this.id = id;
        this.requestAim = requestAim;
        this.account = account;
        this.password = password;
        this.tellphone = tellphone;
        this.requestTime = requestTime;
        this.requestLocation = requestLocation;
        this.identity = identity;
        this.work = work;
        this.age = age;
        this.sex = sex;
        this.nickName = nickName;
        this.reputation = reputation;
    }
}
