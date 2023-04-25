package com.javaProject2.w2.d2;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "GOLD";

        //false
        System.out.println(str1 == str2);

        //true
        System.out.println(str1.equals(str2));

    }
}
