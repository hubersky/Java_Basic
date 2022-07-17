package com.hillel.huberskyi.homeworks;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Hello! Enter the First Team name");
        String firstTeam = inputName();
        System.out.println("Hello! Enter the number of frags for the " + firstTeam + " Team");
        int firstPlayerFirstTeam = inputValue();
        int secondPlayerFirstTeam = inputValue();
        int thirdPlayerFirstTeam = inputValue();
        int fourthPlayerFirstTeam = inputValue();
        int fifthPlayerFirstTeam = inputValue();
        System.out.println("Hello! Enter the Second Team name");
        String secondTeam = inputName();
        System.out.println("Hello! Enter the number of frags for the " + secondTeam + " Team");
        int firstPlayerSecondTeam = inputValue();
        int secondPlayerSecondTeam = inputValue();
        int thirdPlayerSecondTeam = inputValue();
        int fourthPlayerSecondTeam = inputValue();
        int fifthPlayerSecondTeam = inputValue();
        int averageOfFirstTeam = averageOfTeam(firstPlayerFirstTeam,secondPlayerFirstTeam,thirdPlayerFirstTeam,fourthPlayerFirstTeam,fifthPlayerFirstTeam);
        int averageOfSecondTeam = averageOfTeam(firstPlayerSecondTeam,secondPlayerSecondTeam,thirdPlayerSecondTeam,fourthPlayerSecondTeam,fifthPlayerSecondTeam);
        resultOfTeam(firstTeam,secondTeam,averageOfFirstTeam,averageOfSecondTeam);

    }

    static String inputName(){
        Scanner scanner = new Scanner(System.in);
        String nameOfTeam = scanner.nextLine();
        return nameOfTeam;
    }

    static int inputValue(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            int valueOfTeam = scanner.nextInt();
            return valueOfTeam;
        }else {
            System.out.println("Wrong Data");
            scanner.next();
        }
        return -1;
    }

    static int averageOfTeam(int first,int second,int third, int fourth, int fifth){

        int result = (first + second + third + fourth + fifth) / 5;
        return result;
    }

    static void resultOfTeam(String fitsTeamName, String secondTeamName, int firstTeamValue, int secondTeamValue){
        if (firstTeamValue > secondTeamValue){
            System.out.println("The team won " + fitsTeamName + " scored " + firstTeamValue + " points");
        }else if (firstTeamValue < secondTeamValue){
            System.out.println("The team won " + secondTeamName + " scored " + secondTeamValue + " points");
        }else {
            System.out.println("Draw");
        }
    }
}
