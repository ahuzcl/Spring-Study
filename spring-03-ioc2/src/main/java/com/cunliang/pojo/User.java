package com.cunliang.pojo;

public class User {
    private String username;

    public User() {
        System.out.println("无参对象");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void show(){
        System.out.println("name=" + username);
    }
}
