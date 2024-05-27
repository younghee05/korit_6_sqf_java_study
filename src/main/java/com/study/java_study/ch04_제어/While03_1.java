package com.study.java_study.ch04_제어;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class While03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sing = true;

        while (sing) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 입장");
            System.out.println("2. 검색");
            System.out.println("3. 재생");
            System.out.println("p. 퇴장");

            System.out.print("메뉴 선택: ");
            String singMenu = scanner.nextLine();

            switch (singMenu) {
                case "1":
                    System.out.println("노래방에 입장하였습니다.");
                    break;
                case "2":
                    System.out.println("검색창으로 들어왔습니다");
                    boolean singMenu2 = true;
                    while(singMenu2) {
                        System.out.println("[검색창]");
                        System.out.println("1. 발라드");
                        System.out.println("2. 락");
                        System.out.println("3. ost");
                        System.out.println("4. K-pop");
                        System.out.println("b. 메인 메뉴 가기");
                        System.out.println("p. 퇴장");
                        System.out.print("입력: ");
                        String str = scanner.nextLine();
                        switch (str) {
                            case "1":
                                System.out.println("발라드 목록 입니다.");
                                break;
                            case "2":
                                System.out.println("락 목록입니다.");
                                break;
                            case "3":
                                System.out.println("ost 목록입니다.");
                                break;
                            case "4":
                                System.out.println("K-pop 목록입니다");
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다");
                                singMenu2 = false;
                                break;
                            case "p":
                                System.out.println("프로그램을 종료합니다");
                                sing = false;
                                singMenu2 = false;
                                break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("영상을 시청합니다");
                    break;
                case "p":
                    System.out.println("노래방에서 퇴장합니다");
                    sing = false;
                    break;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
            }

            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
