package com.hillel.huberskyi.homeworks;

import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        int[] guessedNumberOfCompany = addGuessedNumber(new int[7]);
        int[] guessedNumberOfPlayer = addGuessedNumber(new int[7]);
        int[] sortedCompanyNumber = sortedNumber(guessedNumberOfCompany);
        int[] sortedPlayerNumber = sortedNumber(guessedNumberOfPlayer);
        coincidencesNumber(sortedCompanyNumber, sortedPlayerNumber);
    }

    public static int[] addGuessedNumber(int[] guessedNumber) {
        int maxNumber = 10;
        for (int i = 0; i < guessedNumber.length; i++) {
            int number = (int) (Math.random() * maxNumber);
            guessedNumber[i] = number;
        }
        return guessedNumber;
    }

    public static int[] sortedNumber(int[] guessedNumber) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < guessedNumber.length - 1; i++) {
                if (guessedNumber[i] > guessedNumber[i + 1]) {
                    isSorted = false;
                    temp = guessedNumber[i];
                    guessedNumber[i] = guessedNumber[i + 1];
                    guessedNumber[i + 1] = temp;
                }
            }
        }
        return guessedNumber;
    }

    public static void coincidencesNumber(int[] guessedNumberOfCompany, int[] guessedNumberOfPlayer) {
        boolean num = false;
        for (int i = 0; i < guessedNumberOfCompany.length; i++) {
            if (guessedNumberOfCompany[i] == guessedNumberOfPlayer[i]) {
                num = true;
                System.out.println("Совпал " + i + "й" + " элемент");
            }
        }
        if (!num){
            System.out.println("Нет совпадений");
        }
    }
}