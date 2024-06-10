package com.study.java_study.ch16_제네릭;


import lombok.ToString;

@ToString
public class Sender<T, T2, T3> { // <T> 이게 제네릭 T는 타입을 의미 // 타입을 여러개로도 들수 있다
    private T data1;
    private T2 data2;
    private T3 data3;

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
}
