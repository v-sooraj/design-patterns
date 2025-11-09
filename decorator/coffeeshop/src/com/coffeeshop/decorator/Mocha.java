package com.coffeeshop.decorator;

import com.coffeeshop.beverage.Beverage;

public class Mocha implements CondimentsDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
