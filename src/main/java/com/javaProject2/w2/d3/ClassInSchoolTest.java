package com.javaProject2.w2.d3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();

        Student[] students = new Student[30];

        for (int i = 0; i < 30; i++) {
            students[i] = new Student();
            students[i].setName("student" + i);
            students[i].setAge(i);
            students[i].setPhoneNumber("010-1234-56" + i);
        }

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("김경록");
        teacher.setAge(50);

        classInSchool.setNo(1);
        classInSchool.setTeacher(teacher);
        classInSchool.setStudents(students);
    }
}
