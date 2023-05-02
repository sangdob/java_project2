package com.javaProject2.w3.d2;

public class While687 {
    public static void main(String[] args) {
        int n = 687;
        int answer = 0;

        while (n > 0) {
            System.out.println(n % 10);
            answer += n % 10;
            n /= 10;
        }
        System.out.println("합 : " + answer);
    }
}
