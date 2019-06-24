package com.epam.stream27.coffeemachine;

import java.util.ArrayList;

public class Cappuccino extends CoffeeDrink {

    public Cappuccino() {
        typeOfCoffee = "Cappuccino";
    }

    @Override
    protected void makingCoffee() {
        coffeeIngredients = new ArrayList<>();
        coffeeIngredients.add(Ingredients.ESPRESSO);
        coffeeIngredients.add(Ingredients.MILK_FOAM);
        coffeeIngredients.add(Ingredients.CHOCOLATE_CHIPS);
    }
}
