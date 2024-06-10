package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA {

    @Override // ClassA에서 메소드를 불러오는 것
    public void print(InterfaceA interfaceA) { // print메소드가 interfaceA에 의존한다(주입한다(DI))
        System.out.println("A1 클래스에서 print호출");
        interfaceA.test();
    }
}
