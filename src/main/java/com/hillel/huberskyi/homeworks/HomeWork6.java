package com.hillel.huberskyi.homeworks;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int to = 10;
        int guessNumber = (int) (Math.random() * to);
        Scanner scanner = new Scanner(System.in);
        guessGame(scanner, guessNumber);
    }

    static void guessGame(Scanner scanner, int guessNumber) {
        System.out.println("Hello! Enter the guess number");
        int attempts = 3;
        for (int i = 1; true; i++) {
            int number = scanner.nextInt();
            if (number == guessNumber) {
                System.out.println("Congrats! You guessed the number)");
                break;
            } else if (i == attempts) {
                System.out.println("Game Over!");
                break;
            } else {
                System.out.println("You failed(" + "\n" + "Try again!");
            }
        }
    }
}

