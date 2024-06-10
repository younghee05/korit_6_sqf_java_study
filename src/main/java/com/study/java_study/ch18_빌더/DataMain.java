package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        // 변수가 많아지면 복잡해지니
        Data data = new Data("a", 0, 10.5, null);
        // 코드를 분리해서 쓰자
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);

        // 이 과정을 하나로 묶자 - > 빌더
        // 자리는 상관 x
        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();


    }
}
