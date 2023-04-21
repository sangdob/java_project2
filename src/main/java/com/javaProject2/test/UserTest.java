package com.javaProject2.test;

import com.javaProject2.dto.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("parkSangDo", 27, "sangdob@gmail.com");
        user.toString();
        user.print();
    }
}
