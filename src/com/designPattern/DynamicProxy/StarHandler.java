package com.designPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("真正的方法执行前!");
        System.out.println("面谈，签合同...");
        Object object=null;
        if(method.getName().equals("sing")) {
            method.invoke(realStar, args);
        }
        System.out.println("真正的方法执行后!");
        System.out.println("收尾款");
        return object;
    }
}
