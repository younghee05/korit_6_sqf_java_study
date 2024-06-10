package com.study.java_study.ch15_Statik;

public class StudentService {
    private static StudentService instance; // instance라는 객체는 static을 담을 수 있는 변수

    private StudentService() {} // 생성자를 private을 걸어버려서 다른 클래스에서는 호출이 안된다

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김영희");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
