package com.javaProject2.w1.input;

import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readChar(){
        InputStreamReader input = new InputStreamReader(System.in);

        int asciiCode = 0;
        try {
            asciiCode = input.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(asciiCode);
    }

    public void readChars(){
        InputStreamReader input = new InputStreamReader(System.in);

        try {
            int first = input.read();
            int second = input.read();

            System.out.println("first = " + first);
            System.out.println("second = " + second);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
