package com.ducksim.test;

import com.ducksim.ducks.DecoyDuck;
import com.ducksim.ducks.MallardDuck;
import com.ducksim.ducks.RedheadDuck;
import com.ducksim.ducks.RubberDuck;
import com.ducksim.fly.FlyNoWay;
import com.ducksim.fly.FlyWithJetPack;
import com.ducksim.fly.FlyWithWings;
import com.ducksim.quack.MuteQuack;
import com.ducksim.quack.Quack;
import com.ducksim.quack.Squeak;

public class DucksInPoolTest {


    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new Quack());
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.setFlyBehaviour(new FlyWithWings());
        redheadDuck.setQuackBehaviour(new Quack());
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehaviour(new FlyNoWay());
        rubberDuck.setQuackBehaviour(new Squeak());
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.setFlyBehaviour(new FlyWithJetPack());
        decoyDuck.setQuackBehaviour(new MuteQuack());
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();

    }
}