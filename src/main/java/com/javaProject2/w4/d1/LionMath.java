package com.javaProject2.w4.d1;

public class LionMath {

    public int sumOfFactors(int num) {
        int sum = 0;

        for (int i = num; i > 2; i--) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public void printResult(int num) {
        System.out.println(num + "의 약수 합 : " + sumOfFactors(num));
    }

    public static void main(String[] args) {
        LionMath math = new LionMath();
        math.printResult(12);
        math.printResult(10);
        math.printResult(6);
        math.printResult(20);
    }
}
