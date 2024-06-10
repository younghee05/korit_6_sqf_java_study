package com.study.java_study.ch20_람다;

public class ModificationMain {
    public static void main(String[] args) {

        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) { // 모든 메소드가 'T' 형 타입으로 바뀌고
                System.out.println("기존데이터: " + oldData);
                System.out.println("새로운데이터: " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) { // 모든 메소드가 'T' 형 타입으로 바뀌고
                return newData;
            }
        };

        // 람다 형식: m2에서 new Modification<>() { };과 @Override를 지운 형식 => m3
        //          타입(String)을 생략할 수 있다 / 중괄호를 생략할 경우 return도 같이 생략해줘야함
        Modification<String > m3 = (oldName, newName) -> newName; // modification의 메소드

        String name = "김영희";
        String newName = m1.modify(name, "김익명");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김0희");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김익익");
        System.out.println(newName3);

    }
}
