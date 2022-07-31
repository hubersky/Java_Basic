package com.hillel.huberskyi.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        Iphone iphone = new Iphone();

        android.internet();
        android.call();
        android.sms();
        android.playMarket();

        System.out.println();

        iphone.internet();
        iphone.call();
        iphone.sms();
        iphone.iTunes();
    }
}
