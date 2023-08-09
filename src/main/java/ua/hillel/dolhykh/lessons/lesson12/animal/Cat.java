package ua.hillel.dolhykh.lessons.lesson12.animal;

public class Cat extends Animal {

    int countLive;

    public Cat(int age) {
        super(age);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, int countLive) {
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