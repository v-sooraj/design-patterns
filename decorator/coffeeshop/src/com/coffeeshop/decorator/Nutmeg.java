package com.coffeeshop.decorator;

import com.coffeeshop.beverage.Beverage;

public class Nutmeg implements CondimentsDecorator {

    private final Beverage beverage;

    public Nutmeg(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Nutmeg";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }
}
