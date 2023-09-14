package ua.hillel.dolhykh.homeworks.homework10;

public class Person {

        private String name;
        private int age;

        // Конструктор с параметрами (имя и возраст)
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Правильное объявление конструктора с параметрами (возраст и имя)
        public Person(int age, String name) {
            this.name = name;
            this.age = age;
        }

        // Геттеры и сеттеры...

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public static void main(String[] args) {
            Person person1 = new Person("Alice", 30);
            Person person2 = new Person(25, "Bob");

            System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
            System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
        }
    }


