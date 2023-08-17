package ua.hillel.dolhykh.lessons.lesson14.interfaces;

public class Airplane implements Flyieble {

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}