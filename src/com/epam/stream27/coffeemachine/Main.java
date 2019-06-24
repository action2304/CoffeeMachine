package com.epam.stream27.coffeemachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeDrink coffeeDrink = null;

        chooseCoffeeDrink();
        switch (scanner.nextInt()) {
            case 1:
                coffeeDrink = new Americano();
                System.out.println("Your " + CupSize.getCupSizeMethod().cupSize + " " +
                        coffeeDrink.toString() + " " + Supplements.getSupplements().supplements + " is ready.");
                break;
            case 2:
                coffeeDrink = new Cappuccino();
                System.out.println("Your " + CupSize.getCupSizeMethod().cupSize + " " +
                        coffeeDrink.toString() + " " + Supplements.getSupplements().supplements + " is ready.");
                break;
            case 3:
                coffeeDrink = new Espresso();
                System.out.println("Your " + CupSize.getCupSizeMethod().cupSize + " " +
                        coffeeDrink.toString() + " " + Supplements.getSupplements().supplements + " is ready.");
                break;
            case 4:
                coffeeDrink = new Latte();
                System.out.println("Your " + CupSize.getCupSizeMethod().cupSize + " " +
                        coffeeDrink.toString() + " " + Supplements.getSupplements().supplements + " is ready.");
                break;
        }
    }

    private static void chooseCoffeeDrink() {
        System.out.println("Choose a coffee drink:");
        System.out.println("1 - Americano");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Espresso");
        System.out.println("4 - Latte");
    }
}
