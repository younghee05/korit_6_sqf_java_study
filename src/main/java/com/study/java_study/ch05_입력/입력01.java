package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner : 입력 받을 때 씀
        // scanner.nextInt(); // nextInt() : int를 리턴한다
        /*
        next() 메소드 특징
        1. 공백과 줄바꿈(엔터)은 무시한다
        2. 버퍼를 사용한다 (= 버퍼 : 데이터의 전송과정에서 데이터가 잠시 머무르는 공간 / 안정적으로 쓰이기위해 쓰는 것)
         */
        System.out.print("a : "); // print를 한 이유 ln을 붙이면 줄이 밑으로 내려가기 때문
        String a = scanner.nextLine(); // 입력값 / next() : String을 기반으로 한다 (리턴한다) , 띄어쓰기를 포함 안할 시 쓰임
        // 정지 할때 까지 입력을 기다리는 것
        System.out.println("에이 : " + a); // 모든 키보드 입력이 버퍼로 저장이 된다

        System.out.print("b :");
        String b = scanner.nextLine();
        System.out.println("비 :" + b);
        /*
        ex) a : 10(스페이스바)20(엔터)
            첫번째 next는 10을 출력하지만
            두번째 next일 때 (스페이스바)20(엔터)가 버퍼에 남아 있으므로
            b : 비 :20으로 출력이 된다
           * next()는 엔터를 출력하지 않으므로
             nextLine()을 쓰면 한줄 당 입력이 된다
         ex) a : 10 20
             에이 : 10 20
             b : 30
             비 : 30
         */



    }
}
