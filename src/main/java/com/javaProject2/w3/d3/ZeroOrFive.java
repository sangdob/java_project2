package com.javaProject2.w3.d3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 555;

        String flagText = "0또는 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0){
                flagText = "0또는 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
