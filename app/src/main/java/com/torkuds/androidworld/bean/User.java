package com.torkuds.androidworld.bean;

/**
 * des:用户信息实体类
 * Created by Administrator
 * on 2017/4/10 0010.
 */

public class User {

    private String phone_num;

    private String password;

    private String user_name;

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone_num='" + phone_num + '\'' +
                ", password='" + password + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
