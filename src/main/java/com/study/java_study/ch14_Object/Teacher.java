package com.study.java_study.ch14_Object;

import lombok.*;

// lombok이라는 라이브러리
@NoArgsConstructor
@AllArgsConstructor

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 4개를 한꺼번에 정의 할 수 있는 기능
// lombok은 자료형을 알아서 캐치하여 출력하게 해줌

public class Teacher {
    private String name;
    private int age;


}
