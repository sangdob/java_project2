package com.javaProject2.w5.d1;

import java.util.Arrays;

/**
 * 오름차순 정렬 : BubbleSort 방식
 * 1회차 배열 정렬
 */
public class BubbleSort02 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        int temp = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
