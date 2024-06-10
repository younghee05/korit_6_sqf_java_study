package com.study.java_study.ch09_클래스04;

import javax.swing.*;
import java.awt.print.Book;
import java.util.Arrays;

// 저장소 -> CRUD(Create, Read, Update, Delete)
public class BookRepository {
    private int bookId;
    // 각각의 기능들을 하나의 그룹으로 만든것이므로 코드 순서와 상관 x

    private BookEntity[] books; // 변수명 books를 만듦

    public BookRepository() { // 생성자
        books = new BookEntity[0]; // 처음에 배열의 공간은 없다로 설정 / 크기가 0인 배열을 생성
    }

    public int autoIncrementBookId() {
        return ++bookId; // autoIncrementBookId가 호출될때마다 bookId는 자동으로 1씩 증가하겠끔 만들어줌
    }

    private void extendBooks() {
        /*// 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1]; // saveBook은 기존 공간(books)에 한 크기를 늘리는 역할하도록 설정함

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다. (반복이 하는 역할)
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }*/


        // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다. (= 주소값을 통제로 옮겼다)
        books = Arrays.copyOf(books, books.length + 1); //
    }

    private int getLastIndex() {
        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        return books.length - 1;
    }

    public void saveBook(BookEntity book) { // 자료형 변수명
        //배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;

    }

    // 단건조회
    public BookEntity findBookByBookId(int bookId) { // 찾을려면 return 해줘야 한다
        BookEntity findBook = null;

        // 선형 탐색
        for(BookEntity book : books ) { // books라는 배열안에 하나씩 꺼내는 것
            if(book.getBookId() == bookId) {
                findBook = book; // 대입
                break; // 찾으면 끝내도록 설정
            }
        }
        return findBook; // 여러개 조회하기 위해 return을 씀
    }

    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) { // name은 string으로 이루어져 있기에 equals로 비교를 해야함
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // contains는 getBookName()가 (bookName)에 포함 되어 있냐 라는 뜻 (string에 쓰임)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }

                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    // 다건 조회 : 여러개를 조회하는 기능
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText); // for(BookEntity book : books) {if(||,||,||)
                                                                        // newArraySize++; } 를 불러옴 (위에 꺼)
        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;

        switch (option) {
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // contains는 getBookName()가 (bookName)에 포함 되어 있냐 라는 뜻 (string에 쓰임)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book; // book을 searchBooks라는 새로운 배열에 넣은 것
                        i++; // 다음 책을 넣기 위함
                    }
                }

                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        searchBooks[i] = book; // size값만큼 반복을 돌려야 하므로 for(int i = 0; i < .length; i++)을 안 쓰는 이유
                        i++;
                    }
                }
                break;
            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }

    private int indexOfByBookId(int bookId) { // bookId가 위치한 Index를 찾아주는
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }

        return findIndex;
    }

    public void deleteBookByBookId(int bookId) {
        int findIndex = indexOfByBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length - 1]; // 새로운 배열을 만들것다

        for(int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1]; // ex) 1번을 삭제한다고 하면 newBooks[1]의 자리에서 books[2]자리를 1번 배열자리에 옮긴다
        }
    }
}
