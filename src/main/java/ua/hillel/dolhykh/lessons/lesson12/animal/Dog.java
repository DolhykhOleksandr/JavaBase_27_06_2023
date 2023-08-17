package ua.hillel.dolhykh.lessons.lesson12.animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    void gau() {
        System.out.println(name + " gau gau");
    }
}