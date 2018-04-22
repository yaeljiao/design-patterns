package com.example.dp;

import com.example.dp.fly.FlyWithWings;
import com.example.dp.quack.MuteQuack;

public class BDuck extends Duck {
    public BDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("b duck");
    }
}
