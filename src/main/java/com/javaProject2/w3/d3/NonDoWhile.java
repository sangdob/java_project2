package com.javaProject2.w3.d3;

import java.util.Scanner;

public class NonDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        for (int i = 0; input1 != 0; i++) {
            System.out.println(input1);
            input1 = sc.nextInt();
        }
    }
}
