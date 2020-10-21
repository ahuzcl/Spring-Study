package com.cunliang.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rentHouse() {
        seeHouse();
        host.rentHouse();
        hetong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介看房");
    }

    public void fare(){
        System.out.println("中介收费");
    }

    public void hetong(){
        System.out.println("签租赁合同");
    }




}
