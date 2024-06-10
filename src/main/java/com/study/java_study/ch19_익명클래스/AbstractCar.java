package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

// abstract
@AllArgsConstructor
@Getter // 전부 Getter
@Data
public abstract class AbstractCar {
    //@Getter // model만 Getter를 걸고 싶다
    private String model;
    private String color;

    public abstract void createCar();
    public abstract void showCar();




}
