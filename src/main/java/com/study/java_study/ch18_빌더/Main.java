package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // class B를 호출 시키기 위해서 먼저 A 클래스 객체를 새로 만들어 준다
        // 즉, 내부 클래스
        // static 클래스가 아닌 경우
        A a = new A();
        A.B b = a.new B(); // a안에 새로운 객체 B를 호출 시킨다

        a.test();
        b.print();

        // static 클래스인 경우

        A.C c = new A.C();
        c.show(); // c를 호출해서 생성 시켜줘야함
        A.C.show2(); //
    }
}
