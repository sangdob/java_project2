package com.javaProject2.w5;


import java.util.Arrays;

/**
 * 오름차순 정렬 : BubbleSort 방식
 */
public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[0] > arr[1]) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
