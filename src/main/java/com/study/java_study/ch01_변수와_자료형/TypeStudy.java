package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리(참과 거짓을 나누는 자료형)
        boolean a = false; // 거짓
        boolean b = true; // 참

        // 2. 숫자(정수)
        int c = 1000;
        long d = 100000000000l; // long쓸때 무조건 뒤에 l붙이기

        // 3. 숫자(실수)
        double e = 3.14;

        // 4. 문자
        char f = '가'; // AC00 = '가' // char는 한 자만 표기 가능하다

        // 5. 문자열
        String g = "가나"; // String은 여러 문장 가능

        System.out.println((char)((int)f + 1)); // 'sout'이라 치면 바로 뜸 // 문자 '가'가 숫자로 변환한 형태 (형변환)
        // (char)((int)f + 1) = > 숫자에서 문자로 변환 1을 더한 형태에서 변환시킴

        // 형변환 순서 : 문자 -> 정수 -> 실수 형태로 표현

        double num = 3.14;
        System.out.println(num);
        // int num2 = num; > 실수가 들어와서 오류가 뜸
        int num2 = (int)num; // 영시적표현 | 정수안에 실수가 못들어가기 때문에 num앞에 int를 붙여줌 => 다운캐스팅
        System.out.println(num2);
        double num3 = num2; // 실수는 정수에 '.0'을 붙여도 되기에 표기가 가능함 => 업캐스팅
        System.out.println(num3);












    }
}
