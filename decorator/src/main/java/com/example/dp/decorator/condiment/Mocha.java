package com.example.dp.decorator.condiment;

import com.example.dp.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    private static final double MOCHA_COST = 0.2;
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return MOCHA_COST + beverage.cost();
    }

}
