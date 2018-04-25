package com.example.abstractfactory.pizzastore;

import com.example.abstractfactory.factory.ChicagoPizzaIngredientFactory;
import com.example.abstractfactory.factory.PizzaIngredientFactory;
import com.example.abstractfactory.pizza.CheesePizza;
import com.example.abstractfactory.pizza.Pizza;
import com.example.abstractfactory.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if ("cheese".equals(item)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if ("veggie".equals(item)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		return pizza;
	}
}
