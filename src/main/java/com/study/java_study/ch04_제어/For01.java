package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) { // 초기값 i를 0으로 시작, (i < 10000) i가 10000까지 (i++: 1씩증가) 출력하게 하라
            System.out.println(i + 1); // + 1을 한 이유 : i가 0으로 시작하기 때문에 1부터 시작하기를 위함(0 + 1)
        } // 반복문은 이 틀에 벗어나질 않는다 / * for(초기문; 탈출조건문; 맨마지막에 증가시킴)

        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i); // 10000부터 1까지 출력 시키는 것
        }
    }
}
