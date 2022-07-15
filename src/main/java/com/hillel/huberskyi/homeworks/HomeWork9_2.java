package com.hillel.huberskyi.homeworks;

import java.util.Arrays;

public class HomeWork9_2 {
    public static void main(String[] args) {
        int[] source = {5, 2, 14, 67, 34, 9};
        int[] target = {13,5,7};
        int[] newArr = arrayCopy(target, source);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] arrayCopy(int[] target, int[] source) {
        int[] newArr = new int[target.length + source.length];
        int count = 0;
        for (int i = 0; i < target.length; i++) {
            newArr[i] = target[i];
            count++;
        }
        for (int j = 0; j < source.length; j++) {
            newArr[count++] = source[j];
        }
        return newArr;
    }
}
