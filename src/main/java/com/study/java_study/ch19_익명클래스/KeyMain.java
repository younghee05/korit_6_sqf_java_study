package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public static void main(String[] args) {

        Key attackKey = new AttackKey();
        attackKey.onKeyUp();
        attackKey.onKeyDown();

        // 익명클래스(클래스를 바로 생성하겠다)
        Key customKey = new Key() { // customKey는 임시로 쓸 이름 (일회용)
            @Override
            public void onKeyUp() {
                System.out.println("커스텀키 뗌");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        };

        customKey.onKeyUp();
        customKey.onKeyDown();

    }
}
