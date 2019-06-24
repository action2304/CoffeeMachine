package com.epam.stream27.coffeemachine;

import java.util.Scanner;

public enum CupSize {

    SMALL("Small"),
    AVERAGE("Average"),
    BIG("Big");

    protected String cupSize;

    static Scanner scanner = null;

    CupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public static CupSize getCupSizeMethod() {
        scanner = new Scanner(System.in);
        CupSize size = null;
        System.out.println("Choose cup size:");
        System.out.println("1 - Small.");
        System.out.println("2 - Average.");
        System.out.println("3 - Big.");
        switch (scanner.nextInt()) {
            case 1:
                size = CupSize.SMALL;
                break;
            case 2:
                size = CupSize.AVERAGE;
                break;
            case 3:
                size = CupSize.BIG;
                break;
        }
        return size;
    }
}
