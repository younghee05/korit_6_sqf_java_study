package com.study.java_study.ch15_Statik;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
 */

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance(); // getInstance가 public으로 걸려 있기에 가져 올 수 있음
        // StudentRepository studentRepository = StudentRepository.getInstance(); // 얘도 마찬가지
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김익명"); // StudentRepository.getInstance() : 객체 주소
        StudentService.getInstance();

        studentService.getStudentData();





    }
}
