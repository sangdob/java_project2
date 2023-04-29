package com.javaProject2.w1.calc;

import java.util.Scanner;

public class FloatAvgEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.2f", (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3);
    }
}
