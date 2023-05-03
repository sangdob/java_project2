package com.javaProject2.w3.d3;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        String printPrime = flag ? "소수입니다." : "소수가 아닙니다.";

        System.out.println(printPrime);
    }
}
