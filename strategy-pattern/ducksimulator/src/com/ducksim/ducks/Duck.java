package com.ducksim.ducks;

import com.ducksim.behaviour.FlyBehaviour;
import com.ducksim.behaviour.QuackBehaviour;

public abstract class Duck {

    //Favor composition over inheritance
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() { // All ducks can swim
        System.out.println("Swimming...");
    }

    /**
     * Program to interface, not implementation (with dynamic behavior):
     * - Ducks depend on abstract behavior interfaces (FlyBehaviour, QuackBehaviour),
     *   not concrete implementations.
     * - Behaviors are encapsulated in concrete classes (FlyWithWings, Squeak, etc.)
     *   that implement these interfaces.
     * - Using setter methods, a duck can dynamically swap its behavior at runtime
     *   without modifying its code.
     *   Example:
     *   rubberDuck.setFlyBehaviour(new FlyWithJetPack());
     */
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}
