package com.example.dp.decorator.condiment;

import com.example.dp.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {
    private static final double SOY_COST = 0.2;
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return SOY_COST + beverage.cost();
    }
}
