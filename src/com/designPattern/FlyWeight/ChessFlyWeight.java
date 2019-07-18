package com.designPattern.FlyWeight;

public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}


class ConcreateChess implements ChessFlyWeight{
    private String color;

    public ConcreateChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"-------"+c.getY());
    }
}
