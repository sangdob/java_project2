package com.javaProject2.w4.d2;

public class PrintStarUtils {
    public static String makePyramidLine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
}
