package com.javaProject2.w3.d1;

import java.util.Scanner;

public class InputMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputN = sc.nextInt();

        printMultiplication(inputN);
    }

    private static void printMultiplication(int inputN) {
        for (int i = 1; i < 10; i++) {
            System.out.println(inputN + " * " + i + " = " + inputN * i);
        }
    }
}
