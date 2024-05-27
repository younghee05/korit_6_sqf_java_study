package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, int b, int c){
        System.out.println(a + b + c); // 오버로딩
    }

    /*
    void add(int a, int b) {

    }
    같은 함수명을 쓸 때 매개변수는 다른게 쓰여야 한다
     */

    void add(int a, String b)  {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }



}
