package org.Reflex.entity;

public class User {
    static {
//        System.out.println("aaa");
    }

    public User() {
    }

    public User(String user_name, String user_phone) {
        this.user_name = user_name;
        this.user_phone = user_phone;
    }

    public String user_name;
    private String user_phone;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }
}