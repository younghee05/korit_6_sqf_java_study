package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringArrayListMain {
    public static void main(String[] args) {
        String[] strArray = new String[10];

        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray); // strArray가 String 자료형을 갖고옴 // asList는 배열을 list로 만든 것

        ArrayList<String> list2 = new ArrayList<>(); // list2라는 List
        list2.addAll(list); // list의 모든 값을 list2에 넣은 것


        String[] strArray2 = strList.toArray(new String[strList.size()]); // toArray는 list를 배열로 만든 것

        //리스트 값 조회
        System.out.println(strList);


        // contains 포함 조회
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums);

        // 제거 // removeAll -> 같은 값만 모두 지우겠다
        strList.add("김영희");
        strList.add("김일희");
        strList.add("김이희");
        System.out.println(strList);
        System.out.println(strList.remove("test1"));
        System.out.println(strList);
        System.out.println(strList.remove(1));
        System.out.println(strList);
        System.out.println(nums);

        List<Integer> nums2 = List.of(1, 3, 5);

        ArrayList<Integer> nums3 = new ArrayList<>();

        nums3.addAll(nums);

        System.out.println(nums3.removeAll(nums2));
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10); // set = setter
        System.out.println(nums3);

        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3);

        // 반복
        for (int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }

        for (Integer num : nums3) { // for-each는 배열과 동일하게 쓴다
            System.out.println(num);
        }

        Iterator<Integer> ir = nums3.iterator(); // num3객체를 iterator로 바꿔라
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }


}
