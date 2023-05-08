package com.javaProject2.w4.d1;

import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "tester";
        user.age = 20;
        user.phoneNumber = "010-000-0000";

        User user2 = new User();
        user2.name = "test2";
        user2.age = 15;
        user2.phoneNumber = "010-0211-3234";
        user2.printAdult();

        assertThat(user.name).isEqualTo("tester");
        assertThat(user.age).isEqualTo(20);
    }
}