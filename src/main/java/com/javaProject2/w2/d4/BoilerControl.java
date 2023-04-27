package com.javaProject2.w2.d4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature = 22;

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.println("check: " + check);

    }
}
