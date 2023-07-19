package ua.hillel.dolhykh.homeworks.additional_tasks;

import java.util.Scanner;
import java.util.Arrays;

public class MyAPP1 {
    public static void main(String[] args) {
//        Задание:
//        Данно массив.Поменяйте элемент с максимальным значением местами с элементом с минимальным значением.
//
//        int[] values = {10, 20, 4, 6, 11, 9, 125, 1, 8, 0, 3};

        int[] values = {10, 20, 4, 6, 11, 9, 125, 1, 8, 0, 3};

        // Знаходимо індекс максимального і мінімального значень
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }

        // Міняємо місцями елементи
        int temp = values[maxIndex];
        values[maxIndex] = values[minIndex];
        values[minIndex] = temp;

        // Виводимо змінений масив
        for (int value : values) {
            System.out.print(value + " ");
        }

//        Запитайте у користувача кількість елементів масиву.
//        Виходячи з даних, які ввів користувач створіть масив на ту кількість елементів,яку передав користувач.
//        У кожному індексі масиву зберігайте чило яке показуватиме номер елемента масиву.

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть кількість елементів масиву: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}





