package com.study.java_study.ch20_람다;

/*
    람다(Lambda)
    1. 하나의 추상 메소드를 정의 하고 있는 인터페이스에서 사용한다.
    2. 매개변수의 타입을 생략 할 수 있다.
    3. 매개변수가 하나이면 매개변술르 감싸는 () 괄호를 생략할 수 있다.
    4. 다른 명령 없이 바로 리턴만 한다면 메소드를 정의하는
       {} 중괄호와 return 키워들르 생략할 수 있다.

 */

@FunctionalInterface // 함수형 Interface / 메소드를 무조건 하나로 설정하게 해둠 (제약)
public interface Modification<T> {
    // 이 메소드를 쓸때 제네릭을 씀 // 직접 만든거
    T modify(T oldData, T newData);
    // 람다식은 두개의 메소드를 쓸 수 없다 이유: 둘중에 뭘 써야할지 모르기 때문



}
