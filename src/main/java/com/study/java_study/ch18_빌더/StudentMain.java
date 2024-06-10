package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(1)
                .name("김영희")
                .age(20)
                .build();





    }

}
