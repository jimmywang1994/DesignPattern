package com.designPattern.factory;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {
    public Shape getShape(Class<?> clazz){
        try {
            return (Shape)clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
