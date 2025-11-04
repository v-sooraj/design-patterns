package com.strategypattern.fly;

import com.strategypattern.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly...!");
    }
}
