package ua.hillel.dolhykh.lessons.lesson14.interfaces;

public class Bird extends Animal implements Flyieble {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void defaultMethod() {
        System.out.println("bird do something");
    }
}