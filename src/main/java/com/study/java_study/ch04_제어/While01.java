package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(10); // 0 ~ 9까지 중 랜덤으로 선언한다는 뜻 / +1을 붙이면 1 ~ 9까지 중 랜덤
        // Math.을 쓰면 수학적 계산을 도와준다

        while(true) { // while(조건식)
            System.out.print("입력: ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }
        // while은 무조건 무한루프를 우선으로 준다
    }
}
