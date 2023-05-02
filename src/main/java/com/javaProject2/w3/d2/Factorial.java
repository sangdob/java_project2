package com.javaProject2.w3.d2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        printFactorial(n);
    }

    private static void printFactorial(int n) {
        int mul = 1;
        for (int j = n; j > 0; j--) {
            mul *= j;
        }
        System.out.println(mul);
    }
}
