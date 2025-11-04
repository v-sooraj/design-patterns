package com.strategypattern.quack;

import com.strategypattern.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I can't quack...!");
    }
}
