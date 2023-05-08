package com.javaProject2.w4.d1;

public class User {
    public String name;
    public int age;
    public String phoneNumber;

    public User() {

    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void printAdult() {
        System.out.println(isAdult());
    }

    private String isAdult() {
        return age >= 18 ? "성인" : "학생";
    }
}
