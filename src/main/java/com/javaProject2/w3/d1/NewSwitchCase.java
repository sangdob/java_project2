package com.javaProject2.w3.d1;

public class NewSwitchCase {
    public static void main(String[] args) {
        String day = "월";

        String hour = switch (day) {
            case "월", "화", "수", "목", "금" -> "09:00~18:30";
            case "토" -> "09:00~12:00";
            case "일" -> "쉬는날";
            default -> "수 입력이 이상합니다.";
        };

        System.out.println(day + "요일 근무시간은 " + hour + "입니다.");
    }
}
