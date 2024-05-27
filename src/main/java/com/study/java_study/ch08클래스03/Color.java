package com.study.java_study.ch08클래스03;

public class Color {
    private String code;
    private String name;

    // AllArgsConstructor

    public Color(String code, String name) {
        this.code = code;
        this.name = name;
    } // alt + Ins 에서 Constructor 들어가서 만들기 (all)


    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void printInfo() {
        System.out.println("색상 코드: " + code);
        System.out.println("색상명: " + name);
    }
}
