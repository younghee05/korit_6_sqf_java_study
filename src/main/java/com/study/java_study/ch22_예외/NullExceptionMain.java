package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("김영희");
        names.add("이다빈");
        names.add("김익명");
        names.add("지현정");

        System.out.println(names);

        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString()); // toString에 null이 걸려버리면 for문이 종료가 되면서 오류처리가 된다.
            }
            System.out.println("트라이 마지막 부분");
        } catch (NullPointerException e) {
            e.printStackTrace(); // 확인용
        } catch (IndexOutOfBoundsException e) { // catch는 계속 걸수 있다.
            e.printStackTrace();
        } catch (Exception e) { // 최종으로 Exception을 걸어줘야함
            e.printStackTrace();
        } catch (Throwable e) { // Exception 보다 더 최종 Throwable / 한번에 처리하겠다
            e.printStackTrace();
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");
    }
}
