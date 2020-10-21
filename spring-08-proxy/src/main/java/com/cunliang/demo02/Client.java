package com.cunliang.demo02;

public class Client {
    public static void main(String[] args) {

        UserServiceProxy serviceProxy = new UserServiceProxy();
        serviceProxy.setUserService(new UserServiceImpl());
        serviceProxy.add();
    }
}
