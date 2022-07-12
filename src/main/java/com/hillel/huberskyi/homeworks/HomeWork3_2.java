package com.hillel.huberskyi.homeworks;

public class HomeWork3_2 {
    public static void main(String[] args) {
        int firstBall = 1;
        double secondBall = 0.5;
        double thirdBall = 0.2;

        double firstBallRadius = (double) 4/3 * Math.PI * Math.pow(firstBall,3);
        double secondBallRadius = (double) 4/3 * Math.PI * Math.pow(secondBall,3);
        double thirdBallRadius = (double) 4/3 * Math.PI * Math.pow(thirdBall,3);

        double weightOfSnowman = (firstBallRadius + secondBallRadius + thirdBallRadius) * 0.7;

        System.out.println(weightOfSnowman);

    }
}
