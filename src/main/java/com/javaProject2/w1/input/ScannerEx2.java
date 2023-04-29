package com.javaProject2.w1.input;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        print(num, num2);
    }

    private void print(int num, int num2) {
        System.out.println("두개의 숫자를 입력하세요. 입력하고 엔터 입력하고 엔터");
        System.out.print("첫번째 숫자:");
        System.out.println("첫번째 숫자는 " + num + "입니다.");
        System.out.print("두번째 숫자:");
        System.out.println("두번째 숫자는 " + num2 + "입니다.");
    }
}
