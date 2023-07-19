package ua.hillel.dolhykh.homeworks.additional_tasks;

public class MyAPP2 {
    public static void main(String[] args) {
//        Задание:
//        Дано массив.Найдите среднее арифметическое для значений этого массива.
//                Выведите на экран только те элементы, которые больше этого среднего арифместического значения
//
//        int[] values = {10, 20, 48, 6, 11, 9, 125, 1, 8, 0, 3, 255, 77, 11, 170, 4, 28};

        int[] values = {10, 20, 48, 6, 11, 9, 125, 1, 8, 0, 3, 255, 77, 11, 170, 4, 28};

        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = sum / values.length;

        System.out.println("Середнє арифметичне значень масиву: " + average);
        System.out.println("Елементи, які більше середнього арифметичного:");

        for (int value : values) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
    }
}









