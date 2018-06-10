package com.designPattern.builder;

public class VegBuger extends Buger {
    @Override
    public String name() {
        return "veg buger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
