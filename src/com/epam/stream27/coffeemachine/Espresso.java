package com.epam.stream27.coffeemachine;

import java.util.ArrayList;

public class Espresso extends CoffeeDrink {

    public Espresso() {
        typeOfCoffee = "Espresso";
    }

    @Override
    protected void makingCoffee() {
        coffeeIngredients = new ArrayList<>();
        coffeeIngredients.add(Ingredients.COFFEE_BEANS);
        coffeeIngredients.add(Ingredients.WATER);
    }
}
