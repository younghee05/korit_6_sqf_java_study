package com.study.java_study.ch02_클래스01;

public class StudentMain {
    public static void main(String[] args) {
       Student student1 = new Student(); // 학생 정보를 2개 이상 담을 경우 여러개로 나눠 쓴다.
       Student student2 = new Student(); // ex) student1 , student2

       student1.name = "김영희";
       student1.age = 20;
       student2.name = "김익명";
       student2.age = 25;



    }
}
