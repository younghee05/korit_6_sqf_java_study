package com.study.java_study.ch09_클래스04;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Scanner;

public class BookService { // service: 기능을 담는 용으로 쓸거
    
    private Scanner scanner; // scanner라는 객체 하나로 모든 그룹이 쓸수 있다
    private BookRepository bookRepository;
    
    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectedMenu() {
        String[] menus = {"1","2", "3","4","q"}; // 1234q만 입력하겠다는 뜻
        String selectedMenu = null;

        while (true) { // 제대로 된 입력을 받을때 까지 반복하겠다
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(Arrays.binarySearch(menus, selectedMenu) > -1) {  // Arrays.binarySearch( , ) : binarySearch는 괄호 안에 탐색하여 찾는 것
                break;
            }
            System.out.println("잘 못 된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }
    
    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectedMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook(); // 하나로 축약됨
                break;
            case "2":
                search(); // 하나로 축약
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun; // 마지막에 isRun의 값에 따라 반환함
    }

    private String validateValue(String title) {
        String value = null;
        while (true) {
            System.out.print(title + "명 입력: ");
            value = scanner.nextLine();
            if(!value.isBlank()){ // isBlank : 띄어쓰기를 문자로 안보기 위한(공백체크) / isEmpty : 띄어쓰기 포함
                // 공백이 아니면
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시입력하세요.");
        }
        return value;
    }

    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서"); // 공백체크 먼저 / 여기 안에 while문이 먼저 실행 됨 먼저 확인후 이 쪽 으로 반복
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명은 존재합니다. 다시입력하세요.");
        }
        return bookName; // bookName을 리턴할거다
    }


    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId(); // 도서가 추가할때마다 Id는 1씩 증가함
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // nextInt 쓰면 무조건 / 엔터 날려주기
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return; // 메소드를 빠져나가기 위함
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
            System.out.println();
        }

    }

    private void remove() {
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.print("삭제 할 도서번호 입력: ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId); // 삭제가 되도록 하는 기능
    }

    private void modify() {
        System.out.println("[ 도서 수정 ]");
        search();
        System.out.print("수정 할 도서번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        System.out.println("<< 도서 수정 정보 입력 >>"); // null이 아니면 입력
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.println("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // equalsIgnoreCase: 대소문자 구분없이 비교하라는 뜻
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1:
                    System.out.println("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // equalsIgnoreCase: 대소문자 구분없이 비교하라는 뜻
                        String author = validateValue("저자");
                        book.setBookName(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.println("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // equalsIgnoreCase: 대소문자 구분없이 비교하라는 뜻
                        String publisher = validateValue("출판사");
                        book.setBookName(publisher);
                        break;
                    }
            }
        }
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        book.setBookName(bookName);
        book.setAuthor(author);
        book.setPublisher(publisher);


    }

}
