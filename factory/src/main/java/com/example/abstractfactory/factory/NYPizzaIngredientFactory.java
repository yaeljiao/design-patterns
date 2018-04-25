package com.example.abstractfactory.factory;

import com.example.abstractfactory.ingredient.cheese.Cheese;
import com.example.abstractfactory.ingredient.cheese.ReggianoCheese;
import com.example.abstractfactory.ingredient.clam.Clams;
import com.example.abstractfactory.ingredient.clam.FreshClams;
import com.example.abstractfactory.ingredient.dough.Dough;
import com.example.abstractfactory.ingredient.dough.ThinCrustDough;
import com.example.abstractfactory.ingredient.pepperoni.Pepperoni;
import com.example.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import com.example.abstractfactory.ingredient.sauce.MarinaraSauce;
import com.example.abstractfactory.ingredient.sauce.Sauce;
import com.example.abstractfactory.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
