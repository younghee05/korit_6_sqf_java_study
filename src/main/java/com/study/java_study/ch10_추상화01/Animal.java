package com.study.java_study.ch10_추상화01;

public class Animal {
    private String name;
    private int age; // Dog와 Tiger의 클래스 안에 공통 사항을 따로 빼 묶어둔 것

    public Animal() {
        super(); // 내 상위의 주소 / ()를 붙이면 Animal 객체 생성자 호출
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() { // Tiger, Dog 클래스도 move라는 생성자를 가지고 있다
        System.out.println("동물이 움직입니다.");

    }


}
