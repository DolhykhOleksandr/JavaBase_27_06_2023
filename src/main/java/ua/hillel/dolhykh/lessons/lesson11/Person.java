package ua.hillel.dolhykh.lessons.lesson11;


public class Person {

    String name;

    int age;

    Person() {
        age = 1;
        name = "NotName";
        System.out.println("fdsgsdfgdf");
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    void sayHello() {
        System.out.println(name + " say hello");
    }


    int getAge() {
        return age;
    }

}