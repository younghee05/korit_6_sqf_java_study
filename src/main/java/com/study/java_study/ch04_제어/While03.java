package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            switch (selectedMenu) { // selectedMenu에 설정한 숫자에 따라 case에 맞게 출력된다
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    break; // switch case의 break이다
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while (isRunMenu2) {
                        System.out.println("[회원 조회]");  // case "2"으로 들어왔으면
                        System.out.println("1. 회원 번호로 조회");     // }
                        System.out.println("2. 회원 이름으로 조회");   //  이런 메뉴창이 뜰것이다
                        System.out.println("b. 뒤로가기");            // }
                        selectedMenu = scanner.nextLine();  // 메뉴창에 따라 입력
                        switch (selectedMenu) { // 입력한 숫자로 출력이 될것이다
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu2 = false; // true이면 메인 메뉴에 2번으로 돌아가 또 반복 될것이다
                                break;
                            case "q" :
                                System.out.println("프로그램을 종료합니다.");
                                isRun = false;
                                isRunMenu2 = false; // 둘다 false로 바꿔버리면 프로그램을 종료 시킬 수 있다 / 순서는 상관없다
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false; // isRun이 false로 바껴버려서 반복문이 끝이난다
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
            }
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
