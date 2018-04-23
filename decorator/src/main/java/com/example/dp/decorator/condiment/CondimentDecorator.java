package com.example.dp.decorator.condiment;

import com.example.dp.decorator.beverage.Beverage;

/**
 * 调料抽象类（装饰者）
 * @author zhichao
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
