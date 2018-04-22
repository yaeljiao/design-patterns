package com.example.dp;

import com.example.dp.fly.FlyNoWay;
import com.example.dp.quack.Quack;

public class ADuck extends Duck {
    public ADuck() {
        // TODO: 18-4-22 设计原则：此处违背了“面向接口编程，而不是面向实现编程“
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("a duck");
    }
}
