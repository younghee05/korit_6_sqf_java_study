package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
    //    Animal a = new Animal(); // 객체 생성

        Animal[] animals = new Animal[10]; // 배열 생성

        for(int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger(); // true : false
        }

        for(Animal animal : animals) {
            animal.move();
        }

    }
}
