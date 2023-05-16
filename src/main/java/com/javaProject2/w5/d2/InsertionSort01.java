package com.javaProject2.w5.d2;

/**
 * 삽입정렬 점화식
 */
public class InsertionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
            }
        }
    }
}
