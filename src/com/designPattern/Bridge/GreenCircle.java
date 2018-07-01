package com.designPattern.Bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing Circle color red radius:" + radius + "x:" + x + "y:" + y);
    }
}
