package com.example.simplefactory;

import com.example.simplefactory.pizza.Pizza;

public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String pizzaType) {
        // 将变化的部分提取并封装起来
        Pizza pizza = factory.createPizza(pizzaType);

        // 比萨制作的过程是不变的部分
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
