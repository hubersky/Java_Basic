package com.hillel.huberskyi.homeworks;

public class HomeWork2 {
    public static void main(String[] args) {
        byte height = 5;
        byte width = 7;
        byte length = 10;

        short volume = (short) (length * width * height);

        System.out.println("Объем параллелепипеда = " + volume);

        byte  lengthAllSides = (byte) (height + width + length);

        System.out.println("Длина всех сторон = " + lengthAllSides);

        double longitude = 26.573953628540043;
        double latitude = 49.873646624779525;

        System.out.println("Широта = " + latitude);
        System.out.println("Долгота = " + longitude);


    }
}
