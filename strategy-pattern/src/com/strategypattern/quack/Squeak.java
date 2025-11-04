package com.strategypattern.quack;

import com.strategypattern.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak...Squeak...");
    }
}
