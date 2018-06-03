package com.designPattern.Singleton;

public class SingletonObject {

    //创建一个singletonObject的对象,最简单的一种方式
    //private static SingletonObject instance=new SingletonObject();

    //创建一个singletonObject的对象,懒汉式 线程不安全
    private static SingletonObject instance;

    private SingletonObject (){};

    //创建一个singletonObject的对象,最简单的一种方式
//    public static SingletonObject getInstance(){
//        return instance;
//    }

    //创建一个singletonObject的对象,懒汉式 线程不安全
//    public static SingletonObject getInstance(){
//        if(instance==null){
//            instance=new SingletonObject();
//        }
//        return instance;
//    }

    //创建一个singletonObject的对象,懒汉式 线程安全
    public static synchronized SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

    public String onMessage(){
        return "this is singleton";
    }
}
