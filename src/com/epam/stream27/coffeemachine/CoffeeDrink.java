package com.epam.stream27.coffeemachine;

import java.util.List;

public abstract class CoffeeDrink {

    protected String typeOfCoffee;
    protected List<Ingredients> coffeeIngredients;

    protected abstract void makingCoffee();

    public void setCoffeeIngredients(List<Ingredients> coffeeIngredients) {
        this.coffeeIngredients = coffeeIngredients;
    }

    @Override
    public String toString() {
        return typeOfCoffee;
    }
}
