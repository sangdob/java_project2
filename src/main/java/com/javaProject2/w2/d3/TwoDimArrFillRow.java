package com.javaProject2.w2.d3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[2][0] =1;
        arr[2][1] =1;
        arr[2][2] =1;
        arr[2][3] =1;
        arr[2][4] =1;

        print(arr);
        input(arr);
        print(arr);
    }

    private static void input(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("X Y : 좌표 입력");
        String[] s = sc.nextLine().split(" ");
        int x = Integer.valueOf(s[0]);
        int y = Integer.valueOf(s[1]);
        arr[x][y] = 1;
    }

    private static void print(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
