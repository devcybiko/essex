package com.agilefrontiers;

public class Util {
    private Util() {
    }

    public static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (double) (max - min)) + min;
    }
}