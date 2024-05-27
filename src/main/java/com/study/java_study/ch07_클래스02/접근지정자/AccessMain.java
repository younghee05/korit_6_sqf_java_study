package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB; // 서로 다른 폴더에 있으면 import를 붙여야 한다

/*
    1. private -> 같은 객체(클래스) 안에서만 접근 할 수 있다
    2. public -> 모든 영역에서 접근 할 수 있다.
    3. default -> 같은 패키지 안에서만 접근 할 수 있다. / 앞에 아무것도 안붙인 것이 default 이다. 예) void show() { }
    4. protected -> default와 동일한 같은 패키지 안에서 접근할 수 있고,
                    상속관계일 때에는 다른 패키지에 있어도 접근할 수 있다.
 */

public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김영희", 20);
        b.setName("김익명");
        System.out.println(b.getName());

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트";
    }

}
