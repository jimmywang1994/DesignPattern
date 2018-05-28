package com.designPattern.AbstactFactory;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory extends AbstarctFactory {
    @Override
    public Color getColor(Class<?> clazz) {
        return null;
    }

    @Override
    public Shape getShape(Class<?> clazz) {
        try {
            return (Shape) clazz.getDeclaredConstructor().newInstance();
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
