package ua.hillel.dolhykh.lessons.lesson13.main;

public abstract class Animal {

    String name;
    int age;

    abstract void run();

    void demoMethod() {
        System.out.println("default");
    }

}