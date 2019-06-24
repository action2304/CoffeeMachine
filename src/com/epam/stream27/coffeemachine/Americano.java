package com.epam.stream27.coffeemachine;

import java.util.ArrayList;

public class Americano extends CoffeeDrink {

    public Americano() {
        typeOfCoffee = "Americano";
    }

    @Override
    protected void makingCoffee() {
        coffeeIngredients = new ArrayList<>();
        coffeeIngredients.add(Ingredients.COFFEE_BEANS);
        coffeeIngredients.add(Ingredients.WATER);
        setCoffeeIngredients(coffeeIngredients);
    }
}
