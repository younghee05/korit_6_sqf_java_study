package com.study.java_study.ch07_클래스02;

public class StudyMain {

    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000); // 생성자 호출 / StudyA는 a에 대입을 하고 있다
        // System.out.println(a); // StudyA의 주소값이 a에 들어가 있다
        System.out.println(a.num);
        System.out.println(a.num2);

        StudyB b = new StudyB();




    }
}
