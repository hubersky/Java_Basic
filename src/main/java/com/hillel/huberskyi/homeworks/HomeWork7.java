package com.hillel.huberskyi.homeworks;

public class HomeWork7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 155; i++) {
            if (i / 10 != 9 && i / 10 != 4) {
                if (i % 5 != 4) {
                    if (i / 10 != 14){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
