package ua.hillel.dolhykh.lessons.lesson13.main;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();



        demoWorkAbstract(cat);
        demoWorkAbstract(dog);

       cat.run();
        dog.run();
    }

    static void demoWorkAbstract(Animal animal) {
        animal.run();
        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        }
        if (animal instanceof Dog) {
            System.out.println("DOG!!!!!!!!!!!!!!1");
        }
    }


}