package com.javaProject2.w2.d2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
