package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {
        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과: " + result);

        Addition addition2 = (x, y) -> x + y; // 람다 : 익명클래스가 생성하고 정의하는 것을 말함

        result = addition2.add(10, 20);
        System.out.println("결과2: " + result);
    }
}
