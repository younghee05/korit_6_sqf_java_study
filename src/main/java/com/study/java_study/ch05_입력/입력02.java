package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        String address = null;
        String gender = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();
        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine(); // nextInt에서 20(엔터)를 쓴느 순간 버퍼에 엔터가 남아있어 바로 사용하기 위함으로 쓰인다
        // 엔터를 쓰면 다음으로 넘어가기 때문 (주소 -> 성별) 이유: 뒤에 nextLine()이 있어 얘가 엔터를 먹기때문 그래서 필요없다
        System.out.print("주소: ");
        address = scanner.nextLine();
        System.out.print("성별: ");
        gender = scanner.next();
        scanner.nextLine();
        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);

    }
}
