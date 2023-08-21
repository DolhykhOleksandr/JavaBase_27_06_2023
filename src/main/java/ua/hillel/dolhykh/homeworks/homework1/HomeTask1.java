package ua.hillel.dolhykh.homeworks.homework1;

public class HomeTask1 {

    public static void main(String[] args) {
        int[] values = {0, 20, 4, 6, 11, 9, 125, 1, 8, 10, 3}; //125 меняеи с 0 местами

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

        System.out.println();
        int[] values1= {0, 20, 4, 6, 11, 9, 125, 1, 8, 10, 3}; // 125 меняем с 0 местами

        int indexValueToReplace1 = 0; // Индекс элемента со значением 10
        int indexValueToReplace2 = 6; // Индекс элемента со значением 20

        // Міняємо місцями елементи
        int temp1 = values1[indexValueToReplace1];
        values1[indexValueToReplace1] = values1[indexValueToReplace2];
        values1[indexValueToReplace2] = temp1;

        // Виводимо змінений масив
        for (int value : values1) {
            System.out.print(value + " ");
        }
    }
}