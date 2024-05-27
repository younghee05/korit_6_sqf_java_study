package com.study.java_study.ch04_제어;

public class For02 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "일차");
            for(int j = 0; j < 10 * (i + 1); j++) { // i는 처음에 0 으로 시작하기에 1일차 일때 1를 +해서 10까지 출력하게 한거고
                                                    // i가 1 증가(= 2일차) 했기에 10 * 2 = 20이 되어 2일차 일때 20까지 출력
                                                    // i가 또 1 증가(= 3일차), 10 * 3 = 30, 3일차 일때 30까지 출력
                System.out.println("줄넘기: " + (j + 1) + "개"); // 먼저 문자열을 썻기에 문자열로 출력이 된다 / 숫자를 먼저 출력하기 위해 ()를 붙인다
            }
        }
    }
}
