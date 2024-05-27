package com.study.java_study.ch03_함수;

public class FunctionMain04 {
    public static void main(String[] args) {
        Function04 function04 = new Function04(); // 자동으로 Function04가 출력된 이유는 자료형을 Function04로 쓰고 있기 때문
        // 변수명은 무조건 소문자로 시작함 변수명을 자동완성할시 클래스명에 앞에 소문자만 바껴 출력된다

        function04.add(10, 20);
        function04.add(10, "20");
    }


}
