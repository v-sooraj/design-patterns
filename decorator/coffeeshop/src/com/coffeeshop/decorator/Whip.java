package com.coffeeshop.decorator;

public class Whip implements CondimentsDecorator {

    private final com.coffeeshop.beverage.Beverage beverage;

    public Whip(com.coffeeshop.beverage.Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String  getDescription() {
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.7;
    }
}
