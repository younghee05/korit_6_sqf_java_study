package com.study.java_study.ch03_함수;

public class FunctionTest02 {

    int getAddData(int a, int b){ // getAddData를 호출하기 위해 매개변수 두개를 선언 해야한다
        FunctionTest03 functionTest03 = new FunctionTest03(); // FunctionTest03의 새로운 객체를 선언
        return functionTest03.add(a, b); // FunctionTest03 에 functionTest03에서 add자료형 호출
                                         // add자료형은 덧셈을 하는 기능이 있으므로 functionTest03에 a b를 더한다는 뜻
                                         // 즉, getAddData에서 functionTest03에 add데이터를 호출하는 것
        /*
         return functionTest03.add(30, 40)을 쓸 경우 FunctionTest01에 10과 20을 받아왔지만 그냥 받기만하고
         결과는 70으로 반환이 된다 이유는 return에 30과 40을 썻기 때문
         */
    }


}
