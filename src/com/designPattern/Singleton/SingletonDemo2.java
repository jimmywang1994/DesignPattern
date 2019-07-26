package com.designPattern.Singleton;

/**
 * 静态内部类实现单例
 */
public class SingletonDemo2 {

    private static class SingletonClassinstance{
        private final static SingletonDemo2 instance=new SingletonDemo2();
    }
    public static SingletonDemo2 getInstance(){
        return SingletonClassinstance.instance;
    }
    private SingletonDemo2 (){

    }
}
