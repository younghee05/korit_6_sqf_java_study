package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        // 프로그램 시작
        // 도서명: 도서1
        // 저자명: 저자1
        // new Book("도서1", "저자1")
        // 반복될때마다 리스트에 추가 (BookList)
        // 입력 3번 받기

        // 도서 전체 조회
        // 도서명 >> 도서1
        // 저자명 >> 저자1 / toString 쓰지 않기

        // 삭제 할 도서명: 도서2

        // 도서 전체 조회
        // 도서명 >> 도서1, 3
        // 저자명 >> 저자1, 3 / toString 쓰지 않기

        System.out.println("프로그램 시작");

        Scanner scanner = new Scanner(System.in);

        List<Book> booklist = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.print("도서명 입력: ");
            bookName = scanner.nextLine();
            System.out.print("저자명 입력: ");
            author = scanner.nextLine();

            booklist.add(new Book(bookName, author)); // 입력받고 바로 list에 담고 이런형태
        }

        for(Book book : booklist) {
            System.out.println("도서명: " + book.getBookName());
            System.out.println("저자명: " + book.getAuthor());
        }

        System.out.print("삭제 할 도서명: ");
        String removeBookName = scanner.nextLine();
        for(Book book : booklist) {
            if(book.getBookName().equals(removeBookName)) {
                booklist.remove(book);
                break; // 지웠다 하면 무조건 break
            }
        }

        for(int i = 0; i < booklist.size(); i++) { // 위에꺼랑 다른 방식
            if(booklist.get(i).getBookName().equals(removeBookName)) {
                Book removeBook = booklist.remove(i);
                System.out.println("삭제된 도서 정보: " + removeBook);
                break;
            }
        }

        for(int i = 0; i < booklist.size(); i++) {
            System.out.println("도서명: " + booklist.get(i).getBookName());
            System.out.println("저자명: " + booklist.get(i).getAuthor());
        }


    }
}
