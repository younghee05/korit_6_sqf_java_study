package com.study.java_study.ch18_빌더;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Data {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    /*public Data(String data1) {
        this.data1 = data1; // 생성자 오버로딩
    }

    public Data(int data2) {
        this.data2 = data2;
    }

    public Data(double data3) {
        this.data3 = data3;
    }

        public Data(String data4) {
            this.data4 = data4;
        }*/ // 이런 식의 생성은 하지 않는다 (자료형을 같은걸 쓸수 없기 때문


}
