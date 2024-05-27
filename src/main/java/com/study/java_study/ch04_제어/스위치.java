package com.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break; // 원하는 값이 출력되기 위함 / 가는 도중 멈춤 / break를 안걸어주면 그대로 쭉 나옴
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");

        }
    }
}
