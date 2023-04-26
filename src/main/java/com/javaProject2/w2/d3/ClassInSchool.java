package com.javaProject2.w2.d3;

public class ClassInSchool {
    private int no;
    private Teacher teacher;
    private Student[] students;

    public ClassInSchool() {
    }

    public ClassInSchool(int no, Teacher teacher, Student[] students) {
        this.no = no;
        this.teacher = teacher;
        this.students = students;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
