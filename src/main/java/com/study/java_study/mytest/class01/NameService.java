package com.study.java_study.mytest.class01;

import java.util.Scanner;

public class NameService {
    private Scanner scanner;
    private NameRepository nameRepository;

    public NameService() {
        scanner = new Scanner(System.in);
        nameRepository = new NameRepository();
    }

    private String selectedMenu() {
        String menus = "1234p";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
        }
        return selectedMenu;
    }

    private boolean run() {
        boolean isRun = true;

        System.out.println("[ 이름 관리 프로그램 ]");
        System.out.println("1. 이름 등록");
        System.out.println("2. 이름 수정");
        System.out.println("3. 이름 삭제");
        System.out.println("4. 이름 검색");
        System.out.println("5. 전체조회");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectedMenu();

        switch (selectedMenu) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "q":
                isRun = false;
                break;
            default:
                System.out.println("다시 입력해주세요.");
        }
        System.out.println();

        return isRun;
    }




}
