package com.example.factorymethod;

import com.example.factorymethod.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);

}
