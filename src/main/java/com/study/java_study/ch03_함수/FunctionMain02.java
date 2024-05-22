package com.study.java_study.ch03_함수;

public class FunctionMain02 {

    public static void main(String[] args) {
        Function02 fx = new Function02(); // 자료형 변수명(마음대로 써도 됨)

        fx.fx01(); // Function02 안에 fx01을 호출한다
        fx.fx02(10, 20); // fx02에 설정한 자료형 대로 써야함 대신 형변환은 가능함
        fx.fx02(100, 200); // ex) fx.fx02(10, (int)20.1(실수형 -> 정수형))
        System.out.println(fx.빙수만들기("딸기", 10) + " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수); //빙수 = 변수명



    }
}
