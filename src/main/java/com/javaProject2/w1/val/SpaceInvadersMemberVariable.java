package com.javaProject2.w1.val;

public class SpaceInvadersMemberVariable {
    private int location = 0; // 멤버변수

    public void moveLeft() {
        location -= 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        location += 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public int getLocation() {
        return location;
    }


    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        for (int i = 0; i < 4; i++) {
            simv.moveRight();
        }

        System.out.println(simv.getLocation());
    }
}
