package com.designPattern.factory;

import org.w3c.dom.css.Rect;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape(Circle.class);
        shape1.draw();
        Shape shape2=shapeFactory.getShape(Rectangle.class);
        shape2.draw();
        Shape shape3=shapeFactory.getShape(Square.class);
        shape3.draw();
    }
}
