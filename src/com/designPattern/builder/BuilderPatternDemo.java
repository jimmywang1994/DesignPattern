package com.designPattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBulider mealBulider=new MealBulider();
        Meal vegMeal=mealBulider.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("total cost:"+vegMeal.getCost());
        Meal vegNonMeal=mealBulider.prepareNonVegMeal();
        System.out.println("veg non meal");
        vegNonMeal.showItems();
        System.out.println("total cost:"+vegNonMeal.getCost());

    }
}
