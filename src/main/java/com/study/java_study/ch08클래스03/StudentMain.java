package com.study.java_study.ch08클래스03;

public class StudentMain {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // 아무런 값을 안넣었기에 0이 5개 들어 있음
        // Student[] students = new Student[5]; // 아무런 값을 안넣었기에 null이 5개 들어 있음

        // numbers[0] = 10;
        // students[0] = new Student(); // 자료형이 student이기 때문에 new 연산자가 들어와야 한다
        // Student[] students = {"", "", "} 와 Student[] ss = new Student[]{"", "", ""} 는 같다
        // 그리고 Student[] s = new Student[3] 와 Student[] ss = new Student[]{"", "", ""}는 같은 의미로 쓴다

        Student[] students = new Student[6];
        students[0] = new Student(20240501, "김영희", 20); // 소괄호는 학생객체 생성 -> Student student1 = new Student();
        students[1] = new Student(20240502, "김일희", 21);
        students[2] = new Student(20240503, "김이희", 22);
        students[5] = new Student(20240505, "김삼희", 23);
        // 위에 껄 배열로

        Student[] studentss = new Student[] {
                new Student(20240501, "김영희", 20), // 0번
                new Student(20240502, "김일희", 21), // 1번
                new Student(20240503, "김이희", 22) // 2번
        };

        for(int i = 0; i < students.length; i++) { // 반복할때 배열 잘 확인하기
            if(students[i] == null) {
                continue; // student[i] 가 null일때 다시 반복문으로 넘어간다
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());
            System.out.println();

        }
    }
}
