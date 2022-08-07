package com.hillel.huberskyi.homeworks.homework16;

import static com.hillel.huberskyi.homeworks.homework16.Drinks.*;

public class Main {
    public static void main(String[] args) {
        Drinks customer = new Drinks();
        customer.chooseDrink();
        System.out.println("The number of drinks " + countDrinks);
        System.out.println("You have to pay " + overallPrice + " dollars");
    }

}
