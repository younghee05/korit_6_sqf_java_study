package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        // 추가

        strSet.add("김영희"); // add는 하나씩
        strSet.add("김일희");
        strSet.add("김이희");
        strSet.add("김삼희");


        System.out.println(strSet);

        // set는 인덱스(index)가 없다 = 순서가 없다 / 중복이 안된다

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        // 중복 제거
        strSet.addAll(List.of("김영희", "김영희", "김일희"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2)); // 위에꺼를 한줄로 줄인거

        System.out.println(strList);

    }

}
