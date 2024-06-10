package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        // strMap은 독립적으로 쓰이는 객체 이므로 add를 쓰지 않고 대신 put을 씀

        strMap.put(0, "김영희");
        strMap.put(1, "김일희");
        strMap.put(2, "김이희");
        strMap.put(3, "김삼희");

        System.out.println(strMap);

        System.out.println(strMap.get(0)); // = list / 순서가 없다 배열이랑 비슷 하다

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java")); // 해당 값을 불러 올수 있다

        // Set안에 Entry들(entries(복수))이 들어가있다
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        // Map도 인덱스가 없다 // Set은 반복을 돌릴 수 있다
        for(Map.Entry<String, String> entry : entries) { // Map 자료형을 Entry들로 바꿔야함
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

    }
}
