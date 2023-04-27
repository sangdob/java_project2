package com.javaProject2.w2.d4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(isStudent(age) ? "성인" : "학생");
    }

    public static boolean isStudent(int age) {
        return age >= 20;
    }
}
