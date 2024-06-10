package com.study.java_study.ch15_Statik;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance; // instance를 쓸려면 객체가 자기자신(= StudentRepository)이어야 한다

    private StudentRepository() { // 외부에서 호출안되게 막아놓은거
        names = new String[5];
    }

    public static StudentRepository getInstance() { // static 메소드 / StudentRepository를 리턴 자료형으로 만든다
        if(instance == null) {
            instance = new StudentRepository(); // null일때 새 객체를 생성하라
        }
        return instance;
    }

    public void add(String name) { // 이 메소들르 쓸려면 main에 new를 붙여 생성한 다음 출력해야한다
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
