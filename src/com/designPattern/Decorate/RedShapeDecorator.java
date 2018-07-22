package com.designPattern.Decorate;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw(){
        decoratedShape.draw();
    }
    private void setBorder(Shape decoratedShape){
        System.out.println("border color:red");
    }
}
