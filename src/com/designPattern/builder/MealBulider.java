package com.designPattern.builder;

public class MealBulider {
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBuger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBuger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
