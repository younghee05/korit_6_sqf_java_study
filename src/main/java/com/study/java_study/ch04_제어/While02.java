package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("개수: ");
        int count = scanner.nextInt();

        int i = 0;
        while(i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수입니다.");
                i++; // continue 하기전에 i를 증가 시켜버리면 무한 반복이 안된다.
                continue; // 다음 반복으로 계속하라 라는 뜻 // 이럴땐 그냥 else를 쓰면 됨
            }
            System.out.println("홀수 입니다.");
            i++;
        }

        System.out.println();

        for(int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수입니다.");
                continue; // for문 증가식으로 바로 넘어가버리기 때문에 여기에 위치 해야한다
            }
            System.out.println("홀수입니다.");

        }
    }
}
