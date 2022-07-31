package com.hillel.huberskyi.homeworks.homework14;

public class Iphone implements Smartphones, Ios {
    @Override
    public void iTunes() {
        System.out.println("Run iTunes");
    }

    @Override
    public void call() {
        System.out.println("Iphone call");
    }

    @Override
    public void sms() {
        System.out.println("Iphone sms");
    }

    @Override
    public void internet() {
        System.out.println("Safari");
    }
}
