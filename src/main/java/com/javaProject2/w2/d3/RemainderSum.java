package com.javaProject2.w2.d3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;

        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;

        System.out.println(a + b + c);
    }
}
