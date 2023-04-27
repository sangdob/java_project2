package com.javaProject2.w2.d3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        while (num % 10 > 0) {
            answer %= (num % 10);
            num /= 10;

            System.out.printf("num : %d, answer = %d\n", num, answer);
        }
    }
}
