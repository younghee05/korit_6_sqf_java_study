package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        /*
            * 반복을 하기위해 사용함
            생성(사용) 절차
            1. 배열 생성 -> 스트림으로 변환
            2. List 생성 -> 스트림으로 변환
            3. generate 메소드 -> 스트림 생성
            4. 범위 지정 -> 스티림 생성
            5. 빌더 -> 스트림 생성

            중간(가공) 절차
            1. map(Function 이 들어가 있음) (가장 많이 씀)
            2. filter(Predicate) : 조건에 따라 출력하겠다
            3. sorted(Comparator) : Function이랑 똑같다고 생각하면 됨

            최종(결과) 절차
            1. collect -> stream을 List로 변환 시킬 때
            2. 반복자 -> forEach

         */

        Stream<Integer> st1 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5}); // 생성
        List<Integer> numberList = st1.map(n -> n * 2) // 가공 // map : for-each 와 같은 개념 / 순서대로 n에 대입시켜 2를 곱하겠다 라는 뜻
                .peek(n -> System.out.print(n + " ")) // 가공(기타 스트림 메소드) // peek: 중간에 결과확인 할때 쓰임(확인용 > 없어도됨)
                .collect(Collectors.toList()); // 최종

        System.out.println();
        numberList.forEach(n -> System.out.println("n: " + n));

        // List를 stream으로 변환시킴
        List<Integer> filteringNumberList = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteringNumberList);

        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1) // 역정렬을 시켜줌
                .collect(Collectors.toList());

        System.out.println(sortedNumberList);

        // 빌더를 통해 스트림 생성

        Stream<String> nameStream = Stream.<String>builder()
                .add("김영희")
                .add("김익명")
                .add("김진주")
                .add("이다빈")
                .add("손다소")
                .build();

        // nameStream.sorted().forEach(name -> System.out.println(name)); // 이것은 밑에 것이 잘 실행 될 수 있도록 주석 처리한 것
        // 역정렬 / String은 서로 빼는 것이 안됨 즉, Objects.hash 코드를 사용해야 한다
        nameStream.sorted(((o1, o2) -> Objects.hash(o2) - Objects.hash(o1)))
                .forEach(name -> System.out.println(name));

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        phoneList.stream().map(phone -> Phone.builder()
                .number(phone.getNumber() * 2)
                .model(phone.getModel())
                .build())
                .forEach(phone -> System.out.println(phone));

        System.out.println();

        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)  // 홀수만을 찾아
                .forEach(phone -> System.out.println(phone)); // 결과 같을 출력하겠다

        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        System.out.println();

        phoneList.stream()
                .sorted(((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))) // 가나다 순서로 정렬
                .forEach(phone -> System.out.println(phone));
        //      .forEach(System.out :: println); // 이렇게 써도 같은 값이 출력된다

    }
}
