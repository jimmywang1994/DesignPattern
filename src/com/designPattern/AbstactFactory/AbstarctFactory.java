package com.designPattern.AbstactFactory;

public abstract class AbstarctFactory {
    public abstract Color getColor(Class<?> clazz);
    public abstract Shape getShape(Class<?> clazz);
}
