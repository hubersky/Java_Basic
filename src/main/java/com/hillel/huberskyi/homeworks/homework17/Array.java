package com.hillel.huberskyi.homeworks.homework17;

public class Array {

    public static double getAverage(int[][] array){
        double sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return sum / count;
    }

    public static boolean arrayIsSquare(int[][] array){
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                return false;
            }
        }
        return true;
    }
}
