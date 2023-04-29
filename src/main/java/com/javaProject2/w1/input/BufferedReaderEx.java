package com.javaProject2.w1.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readLine(){
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기

        try {
            System.out.println("line1 = " + br.readLine());
            System.out.println("line2 = " + br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void plusTwoNumbers() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            System.out.println("add = " + br.read() + br.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
