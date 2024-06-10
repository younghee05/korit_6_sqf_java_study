package com.study.java_study.ch09_클래스04;

public class StringContains {

    public static void main(String[] args) {
        String str = "법의 해석, 학리적 해석, 논리적해석, 확장해석";
        boolean isContains = str.contains("해석"); // str에 해석이라는 글자가 포함되 있니? / contains = 부분일치

        System.out.println(isContains);
    }
}
