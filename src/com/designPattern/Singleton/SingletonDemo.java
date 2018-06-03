package com.designPattern.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject singletonObject=SingletonObject.getInstance();
        singletonObject.onMessage();
    }
}
