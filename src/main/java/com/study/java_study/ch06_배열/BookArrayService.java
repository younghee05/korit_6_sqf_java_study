package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] bookNames = new String[0];

        boolean isRun = true;
        while(isRun) {
            System.out.println("[책 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 책 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            String[] newBookName = null;
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[책 등록]");
                    newBookName = new String[bookNames.length + 1];
                    for(int i = 0; i < bookNames.length; i++) {
                        newBookName[i] = bookNames[i];
                    }
                    bookNames = newBookName;
                    System.out.print("등록할 책 이름: ");
                    bookNames[bookNames.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[책 수정]");
                    System.out.print("수정 할 책 이름: ");
                    String modifyBookName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBookName(bookNames, modifyBookName);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재 하지 않습니다.");
                        break;
                    }
                    System.out.print("새 책 이름: ");
                    bookNames[findIndex] = scanner.nextLine();
                    System.out.println("수정완료!");
                    break;
                case "3":
                    System.out.println("[책 삭제]");
                    System.out.print("삭제 할 책 이름: ");
                    String removeBookName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBookName(bookNames, removeBookName);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재 하지 않습니다.");
                        break;
                    }
                    newBookName = new String[bookNames.length - 1];
                    for(int i = 0; i < newBookName.length; i++) {
                        if(i < findIndex) {
                            newBookName[i] = bookNames[i];
                            continue;
                        }
                        newBookName[i] = bookNames[i + 1];
                    }
                    bookNames = newBookName;
                    System.out.println(removeBookName + "을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[책 찾기]");
                    System.out.print("조회 할 책 이름: ");
                    String findBookName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBookName(bookNames, findBookName);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 존재 하지 않습니다.");
                        break;
                    }
                    System.out.println("해당 책은 존재 합니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < bookNames.length; i++) {
                        System.out.println("index[" + i + "] " + bookNames[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료 합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
        System.out.println("프로그램 종료");
    }
}
