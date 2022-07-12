package com.hillel.huberskyi.homeworks;

public class HomeWork3_1 {
    public static void main(String[] args) {
        int warriorLi = 13 * 860;
        int archerLi = 24 * 860;
        int riderLi = 46 * 860;

        int powerOfLi = warriorLi + archerLi + riderLi;

        double countWarriorMin = 860 * 1.5;
        int numberOfMin = (int) countWarriorMin;

        int warriorMin = 9 * numberOfMin;
        int archerMin = 35 * numberOfMin;
        int riderMin = 12 * numberOfMin;

        int powerOfMin = warriorMin + archerMin + riderMin;

        System.out.println(powerOfLi);
        System.out.println(powerOfMin);

    }
}
