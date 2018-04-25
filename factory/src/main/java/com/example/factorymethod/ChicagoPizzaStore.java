package com.example.factorymethod;

import com.example.factorymethod.pizza.ChicagoStyleCheesePizza;
import com.example.factorymethod.pizza.ChicagoStyleVeggiePizza;
import com.example.factorymethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        if ("cheese".equals(pizzaType)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(pizzaType)) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
