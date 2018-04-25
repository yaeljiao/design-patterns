package com.example.simplefactory;

import com.example.simplefactory.pizza.CheesePizza;
import com.example.simplefactory.pizza.GreekPizza;
import com.example.simplefactory.pizza.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = new Pizza();

        if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(pizzaType)) {
            pizza = new GreekPizza();
        }   // etc.

        return pizza;
    }
}
