package com.example.dp.decorator.beverage;

/**
 * 饮料抽象类（被装饰者）
 * @author zhichao
 */
public abstract class Beverage {
    protected String description = "Unknown description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
