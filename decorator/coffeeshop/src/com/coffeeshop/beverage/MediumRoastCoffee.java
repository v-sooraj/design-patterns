package com.coffeeshop.beverage;

public class MediumRoastCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Medium Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.75;
    }
}
