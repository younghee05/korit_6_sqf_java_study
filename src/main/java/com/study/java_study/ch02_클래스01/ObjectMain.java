package com.study.java_study.ch02_클래스01;

import java.sql.SQLOutput;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10; // a에 10이라는 주소가 들어와 있는 것
        ObjectA objectA1 = new ObjectA(); // 100번 주소 // 변수명은 무조건 소문자로 시작 // 저장소 활당량
        // 클래스 ObjectA에 objectA 자료형, int 'num', 'String name'이 들어가 있음
        // ObjectA 안에 있는 것들을 넣을 수 있다 // new 새로 만들겠다
        ObjectA objectA2 = new ObjectA(); // 200번

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20; // objectA1에 num에다 20 넣은거
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name); // name에 아무것도 지정하지 않았기에 null이 출력된다


    }
}
