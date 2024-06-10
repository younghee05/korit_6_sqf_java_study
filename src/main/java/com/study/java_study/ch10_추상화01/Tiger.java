package com.study.java_study.ch10_추상화;

public class Tiger extends Animal { // 원래는 Animal자료형에 Tiger자료형이 더해진거
    private int power; // 힘

    public Tiger() {
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(int power) {
        this.power = power;
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    // 재정의(다시정의) -> 상속관계에서만 가능
    @Override // @ : 어노테이션 / Override는 기능이 없다 즉, 재정의한 것을 티내기 위함 / 없어도 잘 작동됨
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move(); // animal클래스에서 설정한 move도 불려온다 라는 뜻 / 순서 상관 x
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power + super.toString() +
                '}';
    }
}

