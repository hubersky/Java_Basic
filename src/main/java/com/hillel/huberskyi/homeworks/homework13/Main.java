package com.hillel.huberskyi.homeworks.homework13;

public class Main {
    public static void main(String[] args) {
        FitnessTracker firstUser = new FitnessTracker("Alex",10,7,1993,"alex.@gmail.com",
                "+380973554533","Kotikov",66.8,120,1567);
        FitnessTracker secondUser = new FitnessTracker("Max",22,11,2000,"max.@gmail.com",
                "+380885637627","Verstappen",71.2,110,2988);
        FitnessTracker lastUser = new FitnessTracker("Sebastian", 7,8,1997,"sebastian.@gmail.com",
                "+380997563553","Vettel",75.0,125,4567);
        firstUser.printAccountInfo();
        secondUser.printAccountInfo();
        lastUser.printAccountInfo();

        secondUser.setWeight(80.0);
        secondUser.setPressure(120);
        lastUser.setSurname("Leb");
        lastUser.setNumberOfStepsPerDay(3678);
        secondUser.printAccountInfo();
        lastUser.printAccountInfo();

    }
}
