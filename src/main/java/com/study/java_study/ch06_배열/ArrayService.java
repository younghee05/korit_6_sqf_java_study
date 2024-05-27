package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0]; // null이 아닌 이유: .length를 쓸 수가 없기 때문

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록"); // 1. create
            System.out.println("2. 수정"); // 4. update
            System.out.println("3. 삭제"); // 3. del
            System.out.println("4. 이름찾기"); //
            System.out.println("5. 전체 조회"); // 2. 조회
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            String[] newNames = null; // 선언는 무조건 한번만
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1]; // names의 처음 공간크기가 0 / 실행될때 공간이 1씩 증가되는 것
                    for(int i = 0; i < names.length; i++) { // names.length: names 의 공간크기까지만 반복하겠다
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                    // 등록할때 마다 반복 = 이름이 누적
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String modifyName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String removeName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, removeName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break; // switch 문 빠져나가는 break
                    }
                    newNames = new String[names.length - 1]; // 삭제할땐 배열의 크기를 줄여야 함
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames; // 배열 자체에 주소를 바꿔줌
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");

            }

        }
        System.out.println("프로그램 종료");
    }
}
