package com.hillel.huberskyi.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        MusicStyles metallica = new RockMusic();
        MusicStyles vivaldi = new ClassicMusic();
        MusicStyles madonna = new PopMusic();


        MusicStyles[] musicStyles = {
                metallica, vivaldi, madonna
        };

        for (MusicStyles music : musicStyles) {
            music.playMusic();
        }
    }
}
