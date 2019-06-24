package com.epam.stream27.coffeemachine;

import java.util.Scanner;

public enum Supplements {

    CINNAMON("Cinnamon"),
    SUGAR("Sugar"),
    MILK("Milk");

    protected String supplements;
    protected String with = "with";

    static Scanner scanner = null;

    Supplements(String supplements) {
        this.supplements = with + " " + supplements;
    }

    public static Supplements getSupplements(){
        scanner = new Scanner(System.in);
        Supplements supplements = null;
        boolean loop = true;
        do {
            System.out.println("Choose one or more supplements:");
            System.out.println("1 - Cinnamon.");
            System.out.println("2 - Sugar.");
            System.out.println("3 - Milk.");
            System.out.println("__________");
            System.out.println("4 - Next.");
            switch (scanner.nextInt()){
                case 1:
                    supplements = CINNAMON;
                    break;
                case 2:
                    supplements = SUGAR;
                    break;
                case 3:
                    supplements = MILK;
                    break;
                case 4:
                    loop = false;
            }
        }while (loop);
        return supplements;
    }

}
