package com.example.abstractfactory.factory;

import com.example.abstractfactory.ingredient.cheese.Cheese;
import com.example.abstractfactory.ingredient.cheese.MozzarellaCheese;
import com.example.abstractfactory.ingredient.clam.Clams;
import com.example.abstractfactory.ingredient.clam.FrozenClams;
import com.example.abstractfactory.ingredient.dough.Dough;
import com.example.abstractfactory.ingredient.dough.ThickCrustDough;
import com.example.abstractfactory.ingredient.pepperoni.Pepperoni;
import com.example.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import com.example.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import com.example.abstractfactory.ingredient.sauce.Sauce;
import com.example.abstractfactory.ingredient.veggie.BlackOlives;
import com.example.abstractfactory.ingredient.veggie.Eggplant;
import com.example.abstractfactory.ingredient.veggie.Spinach;
import com.example.abstractfactory.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
