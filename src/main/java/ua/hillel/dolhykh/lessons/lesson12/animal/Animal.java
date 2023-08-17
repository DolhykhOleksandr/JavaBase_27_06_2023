package ua.hillel.dolhykh.lessons.lesson12.animal;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println(name + " eat");
    }

    int getAge() {
        return age;
    }




}