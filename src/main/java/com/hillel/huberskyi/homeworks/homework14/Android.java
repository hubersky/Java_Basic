package com.hillel.huberskyi.homeworks.homework14;

public class Android implements Smartphones,LinuxOS {
    @Override
    public void playMarket() {
        System.out.println("Run play market");
    }

    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Chrome");
    }
}
