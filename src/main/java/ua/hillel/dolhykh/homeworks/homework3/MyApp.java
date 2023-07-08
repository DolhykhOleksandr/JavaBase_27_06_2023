package ua.hillel.dolhykh.homeworks.homework3;

public class MyApp {
    public static void main(String[] args) {

        double length = 12.0; // Довжина
        double width = 10.0;  // Ширина
        double height = 11.0; // Висота

        double volume = length * width * height; // Об'єм
        System.out.println("Об'єм паралелепіпеда = " + volume);

        double totalLength = 4 * (length + width + height); // Сумарна довжина всіх сторін
        System.out.println("Сумарна довжина всіх сторін = " + totalLength);

        {

            int liWarrior = 860;
            int liArcher = 860;
            int liHorseman = 860;

            int minWarrior = (int) (liWarrior * 1.5);
            int minArcher = (int) (liArcher * 1.5);
            int minHorseman = (int) (liHorseman * 1.5);

            int liTotalAttack = liWarrior * 13 + liArcher * 24 + liHorseman * 46;
            int minTotalAttack = minWarrior * 9 + minArcher * 35 + minHorseman * 12;

            System.out.println("Загальне значення атаки династії Лі: " + liTotalAttack);
            System.out.println("Загальне значення атаки династії Мінь: " + minTotalAttack);
        }
    }
}