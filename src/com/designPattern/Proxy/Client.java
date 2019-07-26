package com.designPattern.Proxy;

public class Client {
    public static void main(String[] args) {
        Star realstar=new RealStar();
        Star proxystar=new ProxyStar(realstar);
        proxystar.confer();
        proxystar.singContract();
        proxystar.bookTicket();
        proxystar.sing();
        proxystar.collectMoney();
    }
}
