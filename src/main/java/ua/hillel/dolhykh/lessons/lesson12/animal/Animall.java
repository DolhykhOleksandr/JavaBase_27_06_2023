package ua.hillel.dolhykh.lessons.lesson12.animal;

public class Animall {

    String name;
    int age;

    public Animall(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animall(String name) {
        this.name = name;
    }

    public Animall(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println(name + " eat");
    }

    int getAge() {
        return age;
    }




}