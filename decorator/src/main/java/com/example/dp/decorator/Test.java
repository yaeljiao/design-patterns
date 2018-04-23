package com.example.dp.decorator;

import com.example.dp.decorator.beverage.Beverage;
import com.example.dp.decorator.beverage.Espresso;
import com.example.dp.decorator.condiment.CondimentDecorator;
import com.example.dp.decorator.condiment.Mocha;
import com.example.dp.decorator.condiment.Soy;

public class Test {
    public static void main(String[] args) {
        // 给加了mocha和soy的Espresso咖啡下单
        Beverage beverage = new Espresso();
        CondimentDecorator decorator1 = new Soy(beverage);
        CondimentDecorator decorator2 = new Mocha(decorator1);
        System.out.println(decorator2.getDescription() + ". Total price is $" + decorator2.cost() + ".");
    }
}
