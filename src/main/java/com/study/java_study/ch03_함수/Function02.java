package com.study.java_study.ch03_함수;

public class Function02 {

    // 매개변수 x, 리턴 x 는 함수
    void fx01(){ // 리턴이 x 함수는 무조건 이거
        System.out.println("fx01 함수 호출");
    }

    // 매개변수 o, 리턴 x 는 함수
    void fx02(int num1, int num2) { // num1 num2로 선언
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1); // 문자열과 다른 자료형이 더하면 무조건 문자열
        System.out.println("num2 : " + num2);
    }

    // 매개변수 o, 리턴 o 는 함수
    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수 : " + count + "개"; // ""인 이유는 String 을 썼기 때문
    }

    // 매개변수 x, 리턴 o 는 함수

    String getData(){
        return "데이터";
    }
}
