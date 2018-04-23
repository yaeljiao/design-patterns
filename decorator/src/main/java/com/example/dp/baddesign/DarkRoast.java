package com.example.dp.baddesign;

public class DarkRoast extends Beverage {
    private static final float DARK_ROAST_COST = 1.99f;

    /**
     * 判断该订单中加入了哪些调料
     */
    public DarkRoast(boolean hasMilk, boolean hasSoy, boolean hasMocha) {
        super(hasMilk, hasSoy, hasMocha);
    }

    @Override
    public double cost() {
        return DARK_ROAST_COST + super.cost();
    }
}
