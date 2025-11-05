package com.ducksim.fly;

import com.ducksim.behaviour.FlyBehaviour;

public class FlyWithJetPack implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with jetpack...!");
    }
}
