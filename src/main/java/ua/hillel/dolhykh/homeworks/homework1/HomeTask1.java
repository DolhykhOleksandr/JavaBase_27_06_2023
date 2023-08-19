package ua.hillel.dolhykh.homeworks.homework1;

public class HomeTask1 {

    public static void main(String[] args) {
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
    }
}