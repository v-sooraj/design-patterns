package com.ducksim.quack;

import com.ducksim.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {


    @Override
    public void quack() {
        System.out.println("Quack...Quack..");
    }
}
