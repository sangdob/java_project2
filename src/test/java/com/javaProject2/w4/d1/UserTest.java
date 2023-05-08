package com.javaProject2.w4.d1;

import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "tester";
        user.age = 20;
        user.printAdult();

        assertThat(user.name).isEqualTo("tester");
        assertThat(user.age).isEqualTo(20);
    }
}