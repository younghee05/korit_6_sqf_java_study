package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
        // int num4 = ? % 2; // ? % 2 에서 ?는 2로 나누면 홀수 짝수로 구분 가능하고 2의 배수인지 구분 가능하다
        // '='는 대입할때 '=='는 같다로 씀
        boolean num4 = 5 % 2 == 0; // 5 % 2의 값이 나머지 0과 같다
        System.out.println(num4); // 나머지가 1이기에 거짓(false)로 표기됨

        System.out.println("////////////////////////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i); // i++ 는 "i = i + 1" 를 한것과 같다
        ++i;
        System.out.println(i);
        System.out.println(++i); // 전 증가
        System.out.println(i++); // 여기서는 증가가 안되지만 (즉, 같은 값이 반복됨)
        System.out.println(i); // 여기서 후 증가가 된다
        System.out.println(--i); // 전 감소 => 증가가된 값에 1을 감소시킴
        System.out.println(i--);
        System.out.println(i); // 후 감소가 이루어진 값이 출력된다

        // * 즉, 후 증감은 i = 10, (++i = 11) -> (10+1), (i++ = 10) -> (10+), i = 11(1+10)
        //               i = 5, (--i = 4) -> (5-1), (i-- = 5) -> (5--), i = 4(|1-5|)
        // 따라서 뒤 늦게 더하고 뺀다 라는 뜻

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)
        System.out.println(true && true); // true(1) * true(1) 과 같다 => true가 나옴
        System.out.println(true && false); // false로 출력됨
        System.out.println(true || true); // true(1) + true(1)과 같다 => true가 나옴
        System.out.println(true || false); // 값이 0이 나오지 않기에(1(true)+0(false)) true가 나옴
        System.out.println(false || false); // false로 출력됨
        System.out.println(!(true && true)); // !true는 false

        System.out.println("////////////////////////////////");
        // 관계연산자
        System.out.println(3 > 2 && 1 == 1); // 둘다 참일때 true로 출력
        System.out.println(1 != 1); // 1은 1과 다르다로 선언했기에 값이 false로 출력됨

        // 조건연산자
        System.out.println(3 > 2 ? 10 : 20); // 첫 번째(3>2)가 조건식 ? ""(참) : ""(거짓) -> (결과)
        // 참이면 10을 나타낸다
        int x = 10;
        int y = 2;
        String result = x % y == 0 ?  "y의 배수입니다." : "y의 배수가 아닙니다.";
        // 결과가 문자열이므로 string을 씀 (둘다 string형으로 써야함)
        String result2 = "" + 10 / 2; // " " 공백처리가 됨 (= 0)
        System.out.println(result);
        System.out.println(result2);

        System.out.println("////////////////////////////");

        // 복합대입연산자
        int number = 10;
        number += 5; // 자기자신한테 5를 더하고 대입하라는 뜻
        System.out.println(number); // 10 + 5
        number -= 1; // 1을 빼서 대입해라
        System.out.println(number); // 15 - 1
        number *= 2;
        System.out.println(number); // 14 * 2
        number /= 2;
        System.out.println(number); // 28 / 2
        number %= 2;
        System.out.println(number); // 14 % 2

        // * 변수명은 하나만 선정한다 ex) int i로 한번쓰면 또 int i로 못 씀 즉, 변수명은 같은걸로 못씀
        /*
        int i = 10;
        1. i + 2; (10+2)
        2. i - 1; (12-1)
        .... i의 값은 10인 상태에서
        한번은 2로 더하고 한번은 1을 뺀 형태
        즉, 하나씩 선언할때 마다 누적이 된다고 보면 된다

         */




    }
}
