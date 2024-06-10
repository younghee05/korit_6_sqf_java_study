package com.study.java_study.ch18_빌더;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numbers2 = new ArrayList<>();

        for(Integer n : numbers) {
            numbers2.add(n * 2);
        }
        // stream : 위에 코드를 한줄로 줄일 수 있다
        List<Integer> number3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(number3);

    }
}
