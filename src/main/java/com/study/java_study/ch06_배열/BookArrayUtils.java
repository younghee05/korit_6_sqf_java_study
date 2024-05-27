package com.study.java_study.ch06_배열;

public class BookArrayUtils {

    int findIndexByBookName(String[] bookNames, String bookName) {
        for(int i = 0; i < bookNames.length; i++) {
            if(bookNames[i].equals(bookName)) {
                return i;
            }
        }
        return -1;
    }
}
