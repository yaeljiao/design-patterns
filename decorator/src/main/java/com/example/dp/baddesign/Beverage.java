package com.example.dp.baddesign;

public class Beverage {
    private static final float MILK_COST = 1.1f;
    private static final float SOY_COST = 1.2f;
    private static final float MOCHA_COST = 1.3f;

    private boolean milk;
    private boolean soy;
    private boolean mocha;

    public Beverage(boolean milk, boolean soy, boolean mocha) {
        this.milk = milk;
        this.soy = soy;
        this.mocha = mocha;
    }

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public double cost() {
        float condimentCost = 0.0f;
        if (hasMilk()) {
            condimentCost += MILK_COST;
        }
        if (hasSoy()) {
            condimentCost += SOY_COST;
        }
        if (hasMocha()) {
            condimentCost += MOCHA_COST;
        }
        return condimentCost;
    }
}
