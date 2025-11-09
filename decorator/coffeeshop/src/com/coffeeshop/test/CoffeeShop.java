package com.coffeeshop.test;

import com.coffeeshop.beverage.Beverage;
import com.coffeeshop.beverage.DarkRoastCoffee;
import com.coffeeshop.beverage.LightRoastCoffee;
import com.coffeeshop.beverage.MediumRoastCoffee;
import com.coffeeshop.decorator.Caramel;
import com.coffeeshop.decorator.Mocha;
import com.coffeeshop.decorator.Nutmeg;
import com.coffeeshop.decorator.Whip;

public class CoffeeShop {

    public static void main(String[] args) {

        Beverage darkRoastWithMochaAndWhip = new Whip(new Mocha(new DarkRoastCoffee()));
        System.out.println(darkRoastWithMochaAndWhip.getDescription());
        System.out.println(String.format("Total Cost: $%.2f", darkRoastWithMochaAndWhip.cost()));

        Beverage lightRoastWithCaramel = new Caramel(new LightRoastCoffee());
        System.out.println(lightRoastWithCaramel.getDescription());
        System.out.println(String.format("Total Cost: $%.2f", lightRoastWithCaramel.cost()));

        Beverage darkRoastPlain = new DarkRoastCoffee();
        System.out.println(darkRoastPlain.getDescription());
        System.out.println(String.format("Total Cost: $%.2f", darkRoastPlain.cost()));

        Beverage mediumRoastWithNutmeg = new Nutmeg(new MediumRoastCoffee());
        System.out.println(mediumRoastWithNutmeg.getDescription());
        System.out.println(String.format("Total Cost: $%.2f", mediumRoastWithNutmeg.cost()));

    }
}
