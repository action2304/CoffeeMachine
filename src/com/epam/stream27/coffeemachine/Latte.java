package com.epam.stream27.coffeemachine;

import java.util.ArrayList;

public class Latte extends CoffeeDrink {

    public Latte() {
        typeOfCoffee = "Latte";
    }

    @Override
    protected void makingCoffee() {
        coffeeIngredients = new ArrayList<>();
        coffeeIngredients.add(Ingredients.COFFEE_BEANS);
        coffeeIngredients.add(Ingredients.WATER);
        coffeeIngredients.add(Ingredients.MILK);
    }
}
