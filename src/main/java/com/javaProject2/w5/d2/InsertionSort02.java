package com.javaProject2.w5.d2;

public class InsertionSort02 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("i:" + i + " j:" + j + " j-1:" + (j - 1));
                if (arr[j - 1] - arr[j] > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
