package com.bonko.object;

class Dog {
    private int age;
    private int name;

    Dog(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}


public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog(18);
        System.out.println(dog);
        System.out.println(dog.getAge());
        dog.setAge(20);
        System.out.println(dog.getAge());
    }
}
