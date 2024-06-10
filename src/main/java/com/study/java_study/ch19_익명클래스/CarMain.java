package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        // 익명 클래스: 일회용 용도 / 잠시 쓰는 경우 (파일이 많아질 것을 대비)
        AbstractCar abstractCar = new AbstractCar("내가만든자동차", "블랙") { // 추상클래스를 절대 생성한게 아님 !
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        }; // 임시로 클래스로 정의하겠다



    }
}
