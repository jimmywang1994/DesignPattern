package com.designPattern.AbstactFactory;

import org.w3c.dom.css.Rect;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstarctFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1=shapeFactory.getShape(Square.class);
        shape1.draw();
        Shape shape2=shapeFactory.getShape(Rectangle.class);
        shape2.draw();
        Shape shape3=shapeFactory.getShape(Circle.class);
        shape3.draw();
        AbstarctFactory colorFactory=FactoryProducer.getFactory("color");
        Color color1=colorFactory.getColor(Red.class);
        color1.fill();
        Color color2=colorFactory.getColor(Blue.class);
        color2.fill();
        Color color3=colorFactory.getColor(Green.class);
        color3.fill();
    }
}
