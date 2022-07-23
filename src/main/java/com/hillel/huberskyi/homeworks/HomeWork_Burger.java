package com.hillel.huberskyi.homeworks;

public class HomeWork_Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    boolean doubleMeat;

    HomeWork_Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);

    }

    HomeWork_Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println(bun + ", " + meat + ", " + cheese + ", " + greens);

    }

    HomeWork_Burger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println(bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ", Double Meat:" + doubleMeat);
    }

}
