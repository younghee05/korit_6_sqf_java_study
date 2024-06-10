package com.study.java_study.ch22_예외;

/**
 * 예외(오류) (> 프로그램이 오류로 인해 꺼지는 것을 방지 하기 위해 )
 * 1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당) 되기 전에 오류
 * 2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류
 */
public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {
        // 예외처리는 기본 적으로 try-catch 를 사용
        for(int i = 0; i < 6; i++) {
            System.out.println("i: " + nums[i]);

        }
        // catch (ArrayIndexOutOfBoundsException e) {
        //  System.out.println(e.getMessage());
        //  e.printStackTrace();  // 비동기처리 / printStackTrace: 오류코드를 보여줌(확인용) / 오류 뜨면 맨위 확인 정답이 다 적혀있음

    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1,2,3,4,5};
        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }
}
