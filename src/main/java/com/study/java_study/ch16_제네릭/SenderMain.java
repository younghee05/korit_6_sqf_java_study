package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {


        // [ Wrapper 자료형 ]            [ 일반 자료형 ]
        //   Integer                      int
        //   Boolean     --(언박싱)-->     boolean
        //   Character   <--(박싱)---      char
        //   Double                       double
        //   Long                         long
        //   Float                        float
        // 제네릭은 일반 자료형을 쓸수가 없다

        Integer num = new Integer(10); // 박싱
        int num2 = num.intValue();    // 언박싱


        Integer num3 = 20; // 자동 박싱
        int numa4 = num3; // 자동 언박싱

        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14); // 생성할때 자료형을 정할 수 있다.
        // <Integer, String, Double>을 자료형 뒤에 놓아도 new Sender<> 생략할 수 있다.
        // 대신 (<Integer, String, Double>) 데이터 자료형은 맞춰줘야함 -> new Sender<>(10, "20", 3.14)

    }
}
