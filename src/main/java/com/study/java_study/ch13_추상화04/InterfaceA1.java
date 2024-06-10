package com.study.java_study.ch13_추상화04;

public class InterfaceA1 implements InterfaceA { // interface가 class로 나갈때 implements를 써야함

    @Override
    public void test() {
        System.out.println("InterfaceA1에서 테스트 실행");
    }
}
