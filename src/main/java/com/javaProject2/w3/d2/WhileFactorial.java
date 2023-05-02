package com.javaProject2.w3.d2;

public class WhileFactorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        while (n > 0) {
            answer *= n--;
        }
        System.out.println(answer);
    }
}
