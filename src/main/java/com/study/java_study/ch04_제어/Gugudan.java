package com.study.java_study.ch04_제어;

public class Gugudan {
    public static void main(String[] args) {
        /*
        [2단]
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18

        ...

         [9단]
         9 x 1 = 9
         ...
         9 x 9 = 81
         */

        System.out.println("[구구단]");

        for(int i = 0; i < 8; i++) { // i가 0부터 8까지 1씩 증가하는 형태
            int dan = i + 2; // i + 2로 반복이 되기에 dan으로 치환해준 것
            System.out.println("[" + dan + "단]");
            for(int j = 0; j < 9; j++) { // j가 0부터 9까지 1씩 증가하는 형태
                int num = j + 1; //  j + 1로 반복이 되기에 num으로 치환해준 것
                System.out.println(dan + " x " + num + " = " + (dan * num));
                // 처음에 i는 0이기 2에서 부터 시작하기 위해 + 2를 해준 것 "x"는 2 x 1를 표현하기 위함 j도 0부터 시작 해서 + 1을 한것
            }
            System.out.println();
        }
    }
}
