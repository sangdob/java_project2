package com.javaProject2.w5.d1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    private int arr[];

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    private int[] sortAround(int n, int[] arr) {
        int temp = 0;

        for (int i = n; i < arr.length; i++) {
            if (arr[n] > arr[n + 1]) {
                temp = arr[n];
                arr[n] = arr[n + 1];
                arr[n + 1] = temp;
                break;
            }
        }

        return arr;
    }

    public void sort() {
        for (int i = 0; i < this.arr.length - 1; i++) {
            arr = sortAround(i, arr);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(this.arr));
    }

    public Comparator<Integer> compare() {
        return (o1, o2) -> compare().compare(o1, o2);
    }
}
