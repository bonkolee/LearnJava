package com.bonko.object;

class Person1 {
//    private 无法被继承
    protected String name = "Tom";

    Person1 () {
        System.out.println("Person1无参构造");
    }

    Person1 (String name) {
        System.out.println("Person1有参构造");
        this.name = name;
    }

}

class Student1 extends Person1 {
    private String name = "Jerry";

    Student1 () {
        //        隐藏调用
        super();
        System.out.println("Student1无参构造");
    }

    Student1 (String name) {
        super(name);
        System.out.println("Student1有参构造");
        this.name = name;
    }

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

public class Demo03 {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.test("Spike");

        Student1 student2 = new Student1("Lip");
        student2.test("Fiona");
//        Person1 person1 = new Person1();
//        person1.name = "abc";
//        System.out.println(person1.name);
    }
}
