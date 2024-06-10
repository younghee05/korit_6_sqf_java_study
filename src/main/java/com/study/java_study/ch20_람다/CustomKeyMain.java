package com.study.java_study.ch20_람다;

public class CustomKeyMain {
    public static void main(String[] args) {
        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();

        // 람다 식 / 익명클래스와 차이점이 있다면 new 가 없다
        // 메소드 클래스 이름이 없음 즉, 인터페이스 안에 하나의 메소드만을 가지고 있어야 한다.
        CustomKey skillKey = () -> { // 화살표 함수라고도 함
            System.out.println("스킬키 누름");
        }; // 중괄호 안에 있는 메소드가 실행이 되는 것이다

        skillKey.onKeyPress();
    }
}
