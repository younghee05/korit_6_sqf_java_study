package com.study.java_study.ch03_함수;

public class FunctionTest01 {

    int fx01_1() {
        return 10; // 자료형이 int 이므로 정수로 표기
    }

    int fx01_2(){
        return 20;
    }

    void printResult(){
        FunctionTest02 functionTest02 = new FunctionTest02(); // FunctionTest02를 FunctionTest01에서 새롭게 상속하려고 할때
        System.out.println(functionTest02.getAddData(fx01_1(), fx01_2())); // fx01_1,fx01_2는 같은 클래스안에 있으므로 참조하지 않음
        // fx01_1() = 10 , fx01_2() = 20을 선정한 상태에서 FunctionTest02에서의 getAddData라를 호출,
        // fx01_1과 fx01_2을 더한다는 형식
    }
}
