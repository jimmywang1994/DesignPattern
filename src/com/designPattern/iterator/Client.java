package com.designPattern.iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma=new ConcreteMyAggregate();
        cma.addObj("aaa");
        cma.addObj("bbb");
        cma.addObj("ccc");
        MyIterator iterator=cma.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
