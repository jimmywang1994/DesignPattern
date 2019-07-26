package com.designPattern.Proxy;

public class ProxyStar implements Star {
    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    private Star star;
    @Override
    public void confer() {
        System.out.println("ProxyStar.confer");
    }

    @Override
    public void singContract() {
        System.out.println("ProxyStar.singContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney");
    }
}
