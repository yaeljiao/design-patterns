package com.example.abstractfactory.factory;

import com.example.abstractfactory.ingredient.cheese.Cheese;
import com.example.abstractfactory.ingredient.clam.Clams;
import com.example.abstractfactory.ingredient.dough.Dough;
import com.example.abstractfactory.ingredient.pepperoni.Pepperoni;
import com.example.abstractfactory.ingredient.sauce.Sauce;
import com.example.abstractfactory.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Cheese createCheese();

    Clams createClam();

    Dough createDough();

    Pepperoni createPepperoni();

    Sauce createSauce();

    Veggies[] createVeggies();
}
