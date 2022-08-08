package com.hillel.huberskyi.homeworks.homework16;

import java.util.Locale;
import java.util.Scanner;

public class Drinks {

    final int COFFEE_PRICE = 4;
    final int TEA_PRICE = 3;
    final int LEMONADE_PRICE = 5;
    final int MOJITO_PRICE = 7;
    final int MINERAL_PRICE = 8;
    final int COCA_COLA_PRICE = 10;
    public static int overallPrice = 0;
    public static int countDrinks = 0;

    public void chooseDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the drinks please");
        String drink = scanner.nextLine();
        try {
            DrinksMachine drinksMachine = DrinksMachine.valueOf(drink.toUpperCase(Locale.ROOT));
            switch (drinksMachine) {
                case COFFEE:
                    coffee();
                    break;
                case TEA:
                    tea();
                    break;
                case LEMONADE:
                    lemonade();
                    break;
                case MOJITO:
                    mojito();
                    break;
                case MINERAL:
                    mineral();
                    break;
                case COCA_COLA:
                    cocaCola();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Data!");
        }
        System.out.println("Would you like to choose another drink ?");
        String choose = scanner.nextLine().toUpperCase(Locale.ROOT);
        if (choose.equals("YES")) {
            chooseDrink();
        }
    }

    public int coffee() {
        countDrinks++;
        return overallPrice += COFFEE_PRICE;
    }

    public int tea() {
        countDrinks++;
        return overallPrice += TEA_PRICE;
    }

    public int lemonade() {
        countDrinks++;
        return overallPrice += LEMONADE_PRICE;
    }

    public int mojito() {
        countDrinks++;
        return overallPrice += MOJITO_PRICE;
    }

    public int mineral() {
        countDrinks++;
        return overallPrice += MINERAL_PRICE;
    }

    public int cocaCola() {
        countDrinks++;
        return overallPrice += COCA_COLA_PRICE;
    }
}
