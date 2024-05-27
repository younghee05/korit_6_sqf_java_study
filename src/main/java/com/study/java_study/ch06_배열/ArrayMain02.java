package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김영희" => 999(주소)
        String a = "김영희"; // 주소 999에 "김영희"가 들어가 있는거
        String b = new String("김영희"); // 새로운 주소 200 -> 999가 들어가 있는 것

        System.out.println(a);
        System.out.println(b); // 출력되는 값은 같음

        System.out.println(a == "김영희"); // true
        System.out.println(b == "김영희"); // false

        String[] names = new String[2];
        names[0] = "김영희";
        names[1] = new String("김영희");

        String[] names2 = {"김영희", new String("김영희"), null}; // new String[]이 생략된것 <- 원래: new String[] { };
        // String[] names2 = { }; 중괄호를 하면 배열의 크기를 정할수 없다

        System.out.println(names[0] == names2[0]); // true
        System.out.println(names[1] == names2[1]); // false (> new라는 연산자 때문에 값이 다르다 라고 한 것) / 배열 비교 한게 아님
        System.out.println(names == names2); // 이게 배열비교

        int n = 10;
        n = n + 1;
        n++;
        n += 1;

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        // System.out.println({"a", "b"}); // 중괄호는 코드를 묶을 때 사용이 된다


    }
    // * 배열은 갑자기 느리거나 줄일 수 없다 그러므로 새로운 배열을 만들어야 한다
}
