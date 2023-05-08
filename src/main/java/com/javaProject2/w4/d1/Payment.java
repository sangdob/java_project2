package com.javaProject2.w4.d1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        if (account.isSufficient()) {
            account.printPay();
        }
    }
}
