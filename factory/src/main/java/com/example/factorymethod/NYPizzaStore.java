package com.example.factorymethod;

import com.example.factorymethod.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(pizzaType)) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
