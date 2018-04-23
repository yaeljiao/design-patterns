package com.example.dp;

import com.example.dp.fly.FlyWithWings;

public class Test {
    public static void main(String[] args) {
        Duck duck = new ADuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
