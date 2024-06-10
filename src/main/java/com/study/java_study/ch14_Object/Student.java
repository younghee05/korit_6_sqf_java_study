package com.study.java_study.ch14_Object;

import java.io.ObjectStreamClass;
import java.util.Objects;

public class Student { // Object가 상속되있다

    private String name; // 1. 변수 정의
    private int age;

    public Student(String name, int age) { // 2. 생성자 정의
        this.name = name;
        this.age = age;
    }

    // 3. getter and setter 정의


    // 4. ctrl + o = > equals and hashcode 정의
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true; // 주소가 같으면 같은 값을 출력하기 위함
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj; // object가 student로 다시 다운 캐스팅이 되야한다
            return Objects.equals(student.name, name) && Objects.equals(student.age, age); // -s : object를 다루기위한 도구가 들어있다는 뜻
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);

    }

    //5. toString 정의

    @Override
    public String toString() { //
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
