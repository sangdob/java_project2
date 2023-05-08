package com.javaProject2.w4.d1;

public class Account {
    private int balance = 2000;

    public boolean isSufficient() {
        return balance >= 1500;
    }

    public void printPay() {
        System.out.println(balance);
    }
}
