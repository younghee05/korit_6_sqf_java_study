package com.study.java_study.ch10_추상화01;

public class Dog extends Animal { // 상속 / 기존에 있던 자료형을 확장(추가)하여 새 자료형을 만드는 것
    private String breed; // 품종

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void move() { // ctrl + o 키를 누르면 자동으로 완성해줌(Override를 하고 싶으면)
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
