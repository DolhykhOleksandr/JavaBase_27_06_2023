package ua.hillel.dolhykh.lessons.lesson13.good.staticc;

public class Person {

    static String name;
    private int age;

    private static int counter = 0;

//    public Person(int age) {
//        this.age = age;
//    }

    public Person() {
        counter++;
    }

    public int getAge() {
        return age;
    }

    static void staticMethod() {
        System.out.println("Person static method");
    }

    void nonStaticMethod() {
        System.out.println("Person non static method");
    }

    public static int getCounter() {
        return counter;
    }
}