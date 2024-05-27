package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String(""); // String name = ""에 텍스트를 넣거나 new String("") 넣은거랑 똑같다
        String name = "김영희";     // 값의 자료형 String
        String phone = "01012641542"; // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) { // == : 주소값 비교 / "" : 문자열 / 문자열을 비교해주는 명령어 ' equals '
            System.out.println("name이 비어있습니다.");
            return; // 함수의 결과가 참이면 이걸로 끝내라는 뜻
        }

        if(stringUtils.isEmpty(phone)) { // String phone == null 이런 조건식은 equals를 쓸수가 없다 (null)
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) { // ""이 문자열이라서 ==라는 등호가 안통한다
            System.out.println("text가 비어있습니다.");
            return; // 이게 끝나는 줄이기에 아무러 의미가 없다는 뜻
        }
        //* return는 중간에 끊는 것 / 이런 상황에서 else를 안쓰이는 것이 낫다


    }
}
