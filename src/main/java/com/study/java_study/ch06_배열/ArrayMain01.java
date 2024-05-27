package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {
       // 배열 = 자료형
        int[] nums = new int[100]; // int[] 는 int 배열 자료형

        //nums[1] = 20;

        //System.out.println(nums[0]);
       // System.out.println(nums[1]); // 이 배열에 20이라는 값이 들어감
       // System.out.println(nums[2]);
       // System.out.println(nums[3]); // 배열은 0부터 시작함

        // 100까지 반복하게 하기

        for(int i = 0; i < 100; i++) { //0 ~ 99까지 반복
            nums[i] = (i + 1) * 10; // nums[i]에서 i에 0 부터 99까지 넣어서 식 대로 출력하겠다 / 출력문이 없어 출력이 안됨
        }

       // for(int num : nums) { // nums = 배열변수 / 인덱스를 가지고는 조회가 안된다 즉, 무조건 처음부터 끝까지 반복 시킨다
       //     System.out.println(num);
      //  }

        // = forEach
        System.out.println("여기서");
        for(int i = 0; i < nums.length; i++) { // .length는 배열의 크기를 말한다 / 위에 꺼를 길게 써놓은 것
            if(i % 2 == 0) { // i 가 짝수라면 넘어가겠다
                continue;
            }
            int num = nums[i]; // 홀수인 i에 nums[홀수]
            System.out.println(num);
        }
    }
}
