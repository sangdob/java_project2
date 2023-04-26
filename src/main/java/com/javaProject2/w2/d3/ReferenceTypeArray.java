package com.javaProject2.w2.d3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student(); // Student 클래스의 초기화
        students[0].setName("김경록");
        students[0].setPhoneNumber("010-1234-5678");
        students[0].setAge(37);
        students[1] = new Student(); // Student 클래스의 초기화
        students[1].setName("김지유");
        students[1].setPhoneNumber("010-1234-5678");
        students[1].setAge(2);

        for (Student stu :students) {
            stu.printStudentInfo();
        }
    }
}
