package com.javaProject2.w4.d1;

public class SpaceInvaders {
    private int location;

    public void moveLeft() {
        location++;
    }

    public void moveRight() {
        location--;
    }

    public void print() {
        System.out.println(location);
    }
}
