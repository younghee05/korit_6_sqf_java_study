package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "김영희", 20, "01012345678"); // 전화번호가 문자열이 이유 : 맨 앞자리가 0이기 때문에

        Student student = new Student(); // Student 클래스에 student라는 자료형을 새로 선언
        student.studentCode = 5645; // student라는 객체안에 정보를 새로 넣은 것
        student.name = "김익명";     // 자료형에 맞춰 알맞게 값을 써야 함
        student.age = 24;
        student.phone = "01054567125";

        fx.fx02(student);



    }
}
