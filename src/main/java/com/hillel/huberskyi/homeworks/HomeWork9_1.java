package com.hillel.huberskyi.homeworks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HomeWork9_1 {
    public static void main(String[] args) {
        int ageFrom = 18;
        int ageTo = 40;
        int age = (int) (ageFrom + Math.random() * ageTo);
        System.out.println(age);
        int[] firstTeam = teamAge(ageFrom, ageTo, new int[25]);
        int[] secondTeam = teamAge(ageFrom, ageTo, new int[25]);
        System.out.println("First Team Age " + Arrays.toString(firstTeam));
        System.out.println("Second Team Age " + Arrays.toString(secondTeam));
        System.out.println("First Team Average Age " + averageAge(firstTeam));
        System.out.println("Second Team Average Age " + averageAge(secondTeam));

    }

    public static int[] teamAge(int ageFrom, int ageTo, int[] arrTeam) {

        for (int i = 0; i < arrTeam.length; i++) {
            int age = (int) (ageFrom + Math.random() * ageTo);
            arrTeam[i] = age;
        }
        return arrTeam;
    }

    public static int averageAge(int[] teamAge) {
        int count = 0;
        for (int i : teamAge) {
           count += i;
        }
        return count / teamAge.length;
    }
}

