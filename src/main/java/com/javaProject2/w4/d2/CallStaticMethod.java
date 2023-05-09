package com.javaProject2.w4.d2;

public class CallStaticMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String s = PrintStarUtils.makePyramidLine(5, i);
            System.out.print(s);
        }
    }
}
