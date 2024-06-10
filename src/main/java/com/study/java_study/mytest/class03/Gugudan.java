package com.study.java_study.mytest.class03;

import java.util.Random;
import java.util.Scanner;

public class Gugudan {

    // 랜덤 수
    public static void randomNum() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {


            System.out.print("1 ~ 100까지 하고 싶은 개수: ");
            int num = scanner.nextInt();

            if(num > 100 || num < 1 ) {
                System.out.println("잘못입력하였습니다.");
                continue;
            }

            if(num <= 100) {
                for(int i = 0; i < num; i++) {
                    int num1 = random.nextInt(9) + 1; // 1 ~ 9 까지
                    int num2 = random.nextInt(9) + 1;

                    System.out.print(num1 + " x " + num2 + " = ");
                    int answer = scanner.nextInt();

                    if(num1 * num2 == answer) {
                        System.out.println("정답입니다.");
                        count++;
                    }

                    if(num1 * num2 != answer) {
                        System.out.println("틀렸습니다");
                        System.out.println("정답을 맞춘 개수는 " + count + "입니다.");
                        break;
                    }
                }

            }
            break;
        }
    }

}
