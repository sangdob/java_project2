package com.javaProject2.w4.d4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("hello");
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
