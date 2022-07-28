package com.hillel.huberskyi.homeworks.homework13;

public class FitnessTracker {

    private String name;
    private int day;
    private int month;
    private int year;
    private int age;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private int pressure;
    private int numberOfStepsPerDay;

    public FitnessTracker(String name, int day, int month, int year, String email, String phone, String surname,
                          double weight, int pressure, int numberOfStepsPerDay) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.age = countAge();
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }

    protected void printAccountInfo() {
        System.out.println("Name: " + name + '\n' +
                "Date Of Birth: " + day + ", " + month + ", " + year + '\n' +
                "Age: " + age + '\n' +
                "Email: " + email + '\n' +
                "Phone: " + phone + '\n' +
                "Surname: " + surname + '\n' +
                "Weight: " + weight + '\n' +
                "Pressure: " + pressure + '\n' +
                "Number Of Steps Per Day: " + numberOfStepsPerDay + '\n');
    }

    private int countAge() {
        int currentYear = 2022;
        int result = currentYear - this.year;
        return this.age = result;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }
}
