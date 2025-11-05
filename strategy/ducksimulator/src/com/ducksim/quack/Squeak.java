package com.ducksim.quack;

import com.ducksim.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak...Squeak...");
    }
}
