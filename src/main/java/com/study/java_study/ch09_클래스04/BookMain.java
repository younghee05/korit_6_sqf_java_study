package com.study.java_study.ch09_클래스04;

public class BookMain {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {} // {} -> 내용을 생략 / 조건에 bookService에 run을 실행 시킴


        System.out.println("프로그램을 종료합니다.");

    }

}
