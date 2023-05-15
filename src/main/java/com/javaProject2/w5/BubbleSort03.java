package com.javaProject2.w5;

/**
 * OOP로 만들어 준 BubbleSort
 */
public class BubbleSort03 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        BubbleSort sort = new BubbleSort(arr);

        sort.sort();
        sort.print();
    }
}
