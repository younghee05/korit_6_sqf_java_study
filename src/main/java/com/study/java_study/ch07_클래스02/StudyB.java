package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name; // private은 한 클래스 안에서 만 공유가 가능하다
    private int age;

    public StudyB() {} // 원래 기본 밑에 것을 만드는 순간 무쓸모가 됨 쓰고 싶음 따로 만들어야함

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ▽ 불러오는 방법 ctrl + Ins
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
