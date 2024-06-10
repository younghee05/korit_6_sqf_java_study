package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        // Runnable (interface 식)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("달린다.");
            }
        };

        runnable.run();

        // Runnable (Lambda 식)
        Runnable runnable1 = () -> {
            System.out.println("달리고 있습니다.");
            System.out.println("10분동안 달리고 있습니다.");
        };

        runnable1.run();

        System.out.println();

        // Function 예시 (interface 식)
        Function<String, Integer> fx = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Integer num = fx.apply("10");
        System.out.println("num: " + num);

        System.out.println();

        // Function 예시 (Lambda 식)
        Function<String, Integer> fx1 = s -> Integer.parseInt(s);
        Integer num1 = fx.apply("20");
        System.out.println("num1: " + num1);

        // andThen
        Integer num2 = fx.andThen(result -> result + 100).apply("30");
        System.out.println("num2: " + num2);

        System.out.println();

        // Consumer 예시 (interface 식)
        Consumer<String> transform = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "님이 접속하였습니다");
                System.out.println(s + "님이 퇴장하였습니다");
            }
        };

        transform.accept("김영희");

        // Lambda 식
        Consumer<String> transform2 = s -> {
            System.out.println(s + "님이 입장하였습니다");
            System.out.println(s + "님이 나가셨습니다");
        };

        transform2.accept("김영희");

        System.out.println();

        // Supplier 예시 (interface 식)
        Supplier<Integer> role = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 999;
            }
        };

        System.out.println(role.get());

        // Lambda 식
        Supplier<Integer> role2 = () -> {
          Integer result = num + 999; // num = 10으로 선언 했었음
          return result;
        };

        System.out.println(role2.get());

        System.out.println();

        // Predicate 예시 (interface 식)
        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        };

        System.out.println(even.test(10));

        // Lambda 식

        Predicate<Integer> even2 = n -> n % 2 == 0;
        System.out.println(even2.test(11));

    }
}
