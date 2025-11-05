package com.ducksim.quack;

import com.ducksim.behaviour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I can't quack...!");
    }
}
