package com.hillel.huberskyi.homeworks;

public class HomeWork4 {
    public static void main(String[] args) {
        int countFrom = 2;
        int countTo = 30;
        int mice = (int) (countFrom + Math.random() * countTo);
        int tigers = (int) (countFrom + Math.random() * countTo);
        int parrots = (int) (countFrom + Math.random() * countTo);
        int elephants = (int) (countFrom + Math.random() * countTo);
        int raccoons = (int) (countFrom + Math.random() * countTo);
        int snakes = (int) (countFrom + Math.random() * countTo);
        System.out.println(countAnimals(mice, tigers, parrots, elephants, raccoons));
        System.out.println(countAnimalsNextYear(mice, tigers, parrots, elephants, raccoons)
                + countAnimals(mice, tigers, parrots, elephants, raccoons));
        System.out.println(countAnimalsNextYear(mice, tigers, parrots, elephants, raccoons, snakes)
                + countAnimals(mice, tigers, parrots, elephants, raccoons));

    }

    static int countAnimals(int mice, int tigers, int parrots, int elephants, int raccoons) {
        return mice + tigers + parrots + elephants + raccoons;

    }

    static int countAnimalsNextYear(int mice, int tigers, int parrots, int elephants, int raccoons) {
        double sum = (mice * 0.3) + (tigers * 0.2) + (parrots * 0.4) + (elephants * 0.05) + (raccoons * 0.8);
        return (int) sum;

    }

    static int countAnimalsNextYear(int mice, int tigers, int parrots, int elephants, int raccoons, int snakes) {
        double sum = (mice * 0.3) + (tigers * 0.2) + (parrots * 0.4) + (elephants * 0.05)
                + (raccoons * 0.8) + (snakes * 0.6);
        return (int) sum;

    }
}
