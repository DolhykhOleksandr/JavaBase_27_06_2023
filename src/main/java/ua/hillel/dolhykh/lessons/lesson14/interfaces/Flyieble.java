package ua.hillel.dolhykh.lessons.lesson14.interfaces;

public interface Flyieble {

    int DISTANCE = 100;

    void fly();

    default void defaultMethod() {
        System.out.println("default method start");
    }

}