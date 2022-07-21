package com.hillel.huberskyi.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrM = addLength(scanner);
        int arrN = addLength(scanner);
        int[][] emptyArr = new int[arrM][arrN];
        int[][] fullArr = addValueInArr(emptyArr);
        int[][] transposeArr = transposeMatrix(fullArr, arrN, arrM);
        printArr(fullArr,transposeArr);
        scanner.close();
    }

    public static int addLength(Scanner scanner) {
        System.out.println("Enter integer number");
        int length = 0;
        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        } else {
            System.out.println("Wrong Data");
            System.exit(0);
        }
        return length;
    }

    public static int[][] addValueInArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9);
            }
        }
        return arr;
    }

    public static int[][] transposeMatrix(int[][] arr, int arrN, int arrM) {
        int[][] transposeArr = new int[arrN][arrM];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposeArr[j][i] = arr[i][j];
            }
        }
        return transposeArr;
    }

    public static void printArr(int[][] beforeTranspose, int[][] afterTranspose) {

        for (int i = 0; i < beforeTranspose.length; i++) {
            for (int j = 0; j < beforeTranspose[i].length; j++) {
                System.out.print(beforeTranspose[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < afterTranspose.length; i++) {
            for (int j = 0; j < afterTranspose[i].length; j++) {
                System.out.print(afterTranspose[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
