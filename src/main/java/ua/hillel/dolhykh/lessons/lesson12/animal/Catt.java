package ua.hillel.dolhykh.lessons.lesson12.animal;

public class Catt extends Animall {

    int countLive;

    public Catt(int age) {
        super(age);
    }

    public Catt(String name) {
        super(name);
    }

    public Catt(String name, int age) {
        super(name, age);
    }

    public Catt(String name, int age, int countLive) {
        super(name, age);
        this.countLive = countLive;
    }

    void meow() {
        System.out.println(name + " say meow");
    }

    @Override
    void eat() {
        super.eat();
        meow();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}