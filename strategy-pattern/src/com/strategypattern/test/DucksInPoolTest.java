package com.strategypattern.test;

import com.strategypattern.ducks.DecoyDuck;
import com.strategypattern.ducks.MallardDuck;
import com.strategypattern.ducks.RedheadDuck;
import com.strategypattern.ducks.RubberDuck;
import com.strategypattern.fly.FlyNoWay;
import com.strategypattern.fly.FlyWithJetPack;
import com.strategypattern.fly.FlyWithWings;
import com.strategypattern.quack.MuteQuack;
import com.strategypattern.quack.Quack;
import com.strategypattern.quack.Squeak;

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