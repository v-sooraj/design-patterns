package com.coffeeshop.decorator;

import com.coffeeshop.beverage.Beverage;

public class Caramel implements CondimentsDecorator {

    private final Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Caramel";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.6;
    }
}
