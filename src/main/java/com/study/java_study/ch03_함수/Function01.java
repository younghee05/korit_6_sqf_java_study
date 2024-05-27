package com.study.java_study.ch03_함수;

public class Function01 {

    int add(int a, int b) { // int 참조자료형(설정할 자료형 변수명, 설정할 자료형 변수명)
        int result = a + b;
        return result;
    }

    int sub(int a, int b){
        int result = a - b;
        return result; // return 뒤에 반환할 값을 쓴다
    }
    // result가 있는 공간이 서로 다른 공간이므로 같은 변수명을 써도 문제가 없다
}
// Function01 안에 저런 것들이 들어가 있다는 거
