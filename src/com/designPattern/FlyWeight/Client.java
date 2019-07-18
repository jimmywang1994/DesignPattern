package com.designPattern.FlyWeight;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight c1=ChessFlyWeghtFactory.getChess("黑色");
        ChessFlyWeight c2=ChessFlyWeghtFactory.getChess("黑色");
        System.out.println(c1);
        System.out.println(c2);

        c1.display(new Coordinate(10,10));
        c2.display(new Coordinate(20,20));

    }
}
