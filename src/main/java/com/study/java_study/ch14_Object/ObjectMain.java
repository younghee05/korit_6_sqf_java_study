package com.study.java_study.ch14_Object;


/*
    Object 클래스(최상위 클래스)

 */

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김영희", 20);
        Student student2 = new Student("김영희", 20);

        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김영희", 20);

        System.out.println(student); // 변수명만 입력해도 toString이 출력됨
        String str = new String("데이터");
        System.out.println(str.toString()); // toString : string의 객체

        String studentData = student.toString(); // String studentData = student<오류> : student(주소)는 String의 객체가 아님 / 그러므로 String의 객체인 toString을 씀
        // student는 String을 상속받지 않음 ------------^

        System.out.println(student.equals(student2)); // 주소비교가 아닌 값비교

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode()); // true가 나오게 하고 싶다
        System.out.println(Objects.hash("김영희"));
        System.out.println(Objects.hash("김영희"));




    }
}
