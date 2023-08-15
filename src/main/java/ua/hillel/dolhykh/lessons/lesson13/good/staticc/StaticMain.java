package ua.hillel.dolhykh.lessons.lesson13.good.staticc;

public class StaticMain {

    public static void main(String[] args) {

//        Person alex = new Person(22);
//        alex.name = "Alex";
//        System.out.println(alex.name);
//        Person.name = "Den";
//        System.out.println(alex.name);


//        System.out.println(Person.name);
//
//        Person.staticMethod();


        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        Person person7 = new Person();
        Person person8 = new Person();

        System.out.println(Person.getCounter());


        PersonChild.staticMethod();

        System.out.println(Math.PI);

    }

}