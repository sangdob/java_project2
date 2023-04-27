package com.javaProject2.w2.d3;

public class People {
    public String name; // 매개변수
    public int age;  // 매개변수
    public String phoneNumber; // 매개변수

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People people = new People();
        people.name = "홍길동";
        people.age = 30;
        people.phoneNumber = "010-0000-0000";

        people.print();
    }
}
