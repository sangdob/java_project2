package com.javaProject2.w1.val;

public class Point2Test {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Point point2 = new Point(2, 3);

        double x = Math.pow((point2.getX() - point.getX()), 2);
        double y = Math.pow((point2.getY() - point.getY()), 2);

        System.out.printf("x = %f, y = %f", x, y);
    }
}
