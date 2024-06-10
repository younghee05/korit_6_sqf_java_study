package com.study.java_study.ch10_추상화01;

/*
Animal[] animals = new Animal[3];
animal[0] = new Animal();
animal[1] = new Tiger(); / Tiger배열만 넣을 수 있다
animal[2] = new Dog(); / Dog배열만 넣을 수 있다

 */

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);  // 업캐스팅을 하더라도 재정의 된것만 유지가 됨

        dog.move(); // animal에 상속이 되있기에 move라는 생성자를 쓸 수 있는 것
        tiger.move();
        ((Tiger)tiger).hunt(); // 업캐스팅이 된적이 있어야지만 다운 캐스팅이 된다.(Tiger 변수안에 hunt라는 자료형을 쓰고 싶을때)
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = tiger = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        for(Animal animal : animals) {
            if(animal instanceof Tiger) { // instanceof : animal 객체가 Tiger 객체
                Tiger t = (Tiger) animal; // animal를 Tiger로 다운캐스팅
                t.hunt(); // hunt를 출력
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal; // Dog로 다운 캐스팅
                d.bark();
            }
        }

        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) { // animal클래스와 Tiger클래스가 같으면 다운 캐스팅 하도록 설정함 (= instanceOf 대처용)
                Tiger t = (Tiger) animal; // animal를 Tiger로 다운캐스팅
                t.hunt(); // hunt를 출력
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal; // Dog로 다운 캐스팅
                d.bark();
            }
        }

    }
}
