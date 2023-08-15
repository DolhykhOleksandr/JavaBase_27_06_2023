package ua.hillel.dolhykh.lessons.lesson13.good.staticc;

public class PersonChild extends Person {


    static void staticMethod() {
        System.out.println("PersonChild static method");
    }

    @Override
    void nonStaticMethod() {
        System.out.println("PersonChild non static method");
    }

}