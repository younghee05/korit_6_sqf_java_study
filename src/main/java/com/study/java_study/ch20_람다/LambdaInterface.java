package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        // 람다 식 / 실행문이 2개 미만이면 중괄호를 생략할 수 있지만 2개 이상일땐 생략 불가한다
        // Runnable 예시
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        }; // 정의만 한것(재정의)

        runnable.run();

        // Function는 제네릭 타입을 줘야함 // 람다 식 / 중괄호 생략시 return도 생략해줘야 한다.
        Function<String, Integer> fx = s -> Integer.parseInt(s); // parseInt : 정수 자료형으로 바꿔주겠다라는 뜻

        Integer num = fx.apply("10");
        System.out.println("num: " + num);

        // andThen 예시 / apply는 람다식을 재정의 할때 쓴다.
        Integer num2 = fx.andThen(result -> result + 100).apply("10");
        System.out.println("num2: " + num2);

        // Consumer 예시
        Consumer<String> transform = s -> {
            System.out.println(s + " 서버에 접속하였음.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("김영희");

        // Supplier 예시
        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get());

        // Predicate 예시
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));
    }
}
