package com.javaProject2.dto;

public class User {
    private String name;
    private int age;
    private String email;

    protected User() {}

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void print(){
        System.out.printf("%s님은 나이가 %d이므로 %s입니다. \n 이메일 : %s"
                , this.name
                , this.age
                , printAdult()
                , this.email);
    }

    private String printAdult() {
        return this.isAdult() ? "성인" : "미성인";
    }

    private boolean isAdult() {
        return this.age >= 20;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
