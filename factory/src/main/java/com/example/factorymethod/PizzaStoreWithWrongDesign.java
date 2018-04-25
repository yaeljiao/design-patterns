package com.example.factorymethod;

import com.example.factorymethod.pizza.*;

public class PizzaStoreWithWrongDesign {
    public Pizza createPizza(String region, String pizzaType) {
        Pizza pizza = null;

        if ("NY".equals(region)) {
            if ("cheese".equals(pizzaType)) {
                pizza = new NYStyleCheesePizza();
            } else if ("veggie".equals(pizzaType)) {
                pizza = new NYStyleVeggiePizza();
            }
        } else if ("Chicago".equals(region)) {
            if ("cheese".equals(pizzaType)) {
                pizza = new ChicagoStyleCheesePizza();
            } else if ("veggie".equals(pizzaType)) {
                pizza = new ChicagoStyleVeggiePizza();
            }
        } else {
            System.out.println("Error: invalid pizza type");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
