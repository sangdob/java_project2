package com.javaProject2.w3.d3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println(num);
        } while(num != 0);
    }
}
