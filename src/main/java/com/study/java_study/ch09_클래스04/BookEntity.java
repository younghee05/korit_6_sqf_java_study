package com.study.java_study.ch09_클래스04;

public class BookEntity { // entity: 개성 (정보를 담는 용) / 정보의 집합체
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity(int bookId,String bookName, String author, String publisher) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.bookId = bookId;
    }

    public BookEntity() {

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "BookEntity {" +
                "bookId= " + bookId +
                ", bookName= '" + bookName + '\'' + // \' -> 문자열에 ' '을 쓸 수 있게 해줌
                ", author= '" + author + '\'' +
                ", publisher= '" + publisher + '\'' +
                '}';
    }
}
