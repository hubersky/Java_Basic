package com.hillel.huberskyi.homeworks;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "+74837646663"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "+68423764872"));
        System.out.println(personInfo(" Sherlock", "Holmes", "London", "+45666373739"));

    }

    static String personInfo(String name, String lastName, String city, String phone) {

        return "Позвонить гражданину " + name + " " + lastName + " из города " + city + " можно по номеру " + phone;
    }
}
