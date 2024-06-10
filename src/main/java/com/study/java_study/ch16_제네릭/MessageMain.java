package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ? / 제네릭을 쓰면서 Object를 쓰고 싶을 때

        Message<?> m1; // 와일드 카드가 Object => ?로 통일 가능
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage(); // 와일드 카드를 쓸때에는 다운 캐스팅을 해줘야 함

        // 와일드 카드 제약
        // String으로 상속 받은 와일드 카드만 String 타입으로 쓰겠다 / 자신을 포함
        Message<? extends String> m3 = new Message<>("10"); // 하행 / 자신으로 부터 아래 자료형을 부를 수 있다
        Message<? super String> m4 = new Message<>(new Object()); // 상행 / 자신으로 부터 위에 자료형을 부를 수 있다 / super는 상을 의미
        // 다운 캐스팅을 할 수 없다
        String s2 = m3.getMessage();



    }
}
