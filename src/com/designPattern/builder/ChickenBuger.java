package com.designPattern.builder;

public class ChickenBuger extends Buger{
    @Override
    public String name() {
        return "chicken buger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
