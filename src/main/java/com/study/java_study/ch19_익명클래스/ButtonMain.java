package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        Button homeButton = new HomeButton();


        click(homeButton);
        // 임시로 설정한 클래스(=익명클래스) / 메인에서 만들어진 이름 없는 클래스를 의미
        click(new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        });

    }

    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();
    }
}
