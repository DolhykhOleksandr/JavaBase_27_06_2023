package ua.hillel.dolhykh.homeworks.test1;

//public class Test {
//    public static void main(String[] args) {
//        int n = 1000;
//        int sum = 0;
//        for (int i = 1; i <= n; ++i) {
//            sum += i;
//
//            System.out.println("i = " + sum);
//        }
//    }
//  } //вывидет все числа от 0 и до 1000,плюс их сумму
//         int n = 1000;
//        int sum = 0;
//        for (int i = 1; i <= n; ++i) {
//            sum += i;
//        }// вывидет суму всех чисел от 0 и до 1000
//            System.out.println("i = " + sum);
//        }
//    }

//        int result = 0;
//        int counter = 3;
//        while (counter < 10) {
//            counter += 1;//Цикл повторюватиметься 7 разів, а лічильник прийматиме значення 4, 5, 6, 7, 8, 9 і 10.
//            result += counter;//Відповідними значеннями результату є 4, 9, 15, 22, 30, 39 і 49. Нарешті, коли лічильник стає 10, умова циклу (лічильник < 10) стає хибною, і цикл завершується.
//        }
//        System.out.println(result);//49
//
//    }
//}
        public class Elephant {

            // Статичне поле класу
            static String animalClass = "Ссавці";

            // Нестатичне поле класу
            String name;

            public Elephant(String name) {
                this.name = name;
            }

            public static void main(String[] args) {
                Elephant africanElephant = new Elephant("Африканський слон");
                Elephant indianElephant = new Elephant("Індійський слон");

                System.out.println("Клас: " + Elephant.animalClass); // Використання статичного поля через ім'я класу

                System.out.println("Ім'я Африканського слона: " + africanElephant.name); // Використання нестатичного поля через об'єкт
                System.out.println("Ім'я Індійського слона: " + indianElephant.name); // Використання нестатичного поля через об'єкт

                Elephant.animalClass = "Тварини"; // Зміна значення статичного поля через ім'я класу

                System.out.println("Нове значення статичного поля: " + Elephant.animalClass); // Виведення нового значення статичного поля
            }
        }
