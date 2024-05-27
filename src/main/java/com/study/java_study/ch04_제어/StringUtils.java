package com.study.java_study.ch04_제어;

public class StringUtils {

    boolean isEmpty(String str) {
        if(str == null) {
            return  true; // return : 이 조건이 true이면 이 결과로 끝내라
        }
        return str.equals(""); // false 형식으로 쓰임
        // 이런 조건문은 else가 필요 없다 / 거의 else는 쓸 필요가 없다
    }
}
