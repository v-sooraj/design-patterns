package com.coffeeshop.beverage;

public class DarkRoastCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}