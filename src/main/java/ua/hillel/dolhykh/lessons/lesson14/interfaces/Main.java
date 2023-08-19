package ua.hillel.dolhykh.lessons.lesson14.interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("Kesha", 4);
        Cat cat = new Cat("Tom", 5);

        Airplane airplane = new Airplane();


        bird.fly();
        airplane.fly();


        bird.defaultMethod();
        airplane.defaultMethod();


        System.out.println(Flyieble.DISTANCE);

//        Flyieble flyieble = new Flyieble();


        Flyieble flyieble = new Bird("Kesha", 4);
        flyieble.fly();

        if (flyieble instanceof Bird) {
            ((Bird) flyieble).getName();
        }

    }
}