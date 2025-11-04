package com.strategypattern.quack;

import com.strategypattern.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {


    @Override
    public void quack() {
        System.out.println("Quack...Quack..");
    }
}
