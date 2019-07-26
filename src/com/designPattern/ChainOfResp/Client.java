package com.designPattern.ChainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a =new Director("张三");
        Leader b=new Manager("李四");
        Leader c=new GeneralManager("王五");
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest r1=new LeaveRequest("Tom",10,"家庭私事");
        a.handleRequest(r1);
    }
}
