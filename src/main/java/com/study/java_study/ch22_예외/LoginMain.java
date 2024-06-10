package com.study.java_study.ch22_예외;

import java.util.Scanner;

public class LoginMain {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";
    public static void login(String username, String password) throws LoginException { // 예외처리를 할거면 throws Exception을 쳐라
        if(!(USERNAME.equals(username) && PASSWORD.equals(password))) {
            throw new LoginException("로그인 실패", username); // throw : 던지다
        }
        System.out.println("로그인 성공 이후 절차 진행");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.print("사용자이름: " );
        username = scanner.nextLine();
        System.out.print("비밀번호: " );
        password = scanner.nextLine();

        try {
            login(username, password);
        } catch (LoginException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");


    }
}
