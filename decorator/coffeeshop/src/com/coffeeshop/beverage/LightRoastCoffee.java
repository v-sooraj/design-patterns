package com.coffeeshop.beverage;

public class LightRoastCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Light Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
