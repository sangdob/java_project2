package com.javaProject2.w1.calc;

public class MultiplicationTable {
    public static void main(String[] args) {
//        2 * 1 = 2
//        2 * 2 = 4
        for (int i = 0; i < 9; i++) {
            int num = i + 1;
            System.out.printf("2 * %d = %d\n", num, 2 * num);
        }
    }
}
