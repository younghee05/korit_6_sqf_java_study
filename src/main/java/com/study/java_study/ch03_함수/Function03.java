package com.study.java_study.ch03_함수;

public class Function03 {

    void fx01(int studentCode, String name, int age, String phone){ // 매개변수가 10개 100개가 될수도 있다 지금은 4개
        System.out.println("fx01함수 호출");
        System.out.println(studentCode);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println();
    }

    void fx02(Student student) { // 학생 매개변수에 학생의 주소만 넣어주면됨 / student(변수명) 하나로만 받게함
        System.out.println("fx02 함수 호출");
        System.out.println(student.studentCode);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.phone);
    }
}
