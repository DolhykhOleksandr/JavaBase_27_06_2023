package ua.hillel.dolhykh.homeworks.additional_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyAPP {
    public static void main(String[] args) {
//        Дан масив [1, 2, 3]. Зробіть із нього масив [3, 2, 1].
        int[] arr = {1, 2, 3};
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));  // [3, 2, 1]

//        Дан масив [1, 2, 3]. Додайте йому до кінця елементи 4, 5, 6.
        int[] arr2 = {1, 2, 3};
        int[] newArr = new int[arr2.length + 3];
        System.arraycopy(arr2, 0, newArr, 0, arr2.length);
        newArr[arr2.length] = 4;
        newArr[arr2.length + 1] = 5;
        newArr[arr2.length + 2] = 6;
        System.out.println(Arrays.toString(newArr));  // [1, 2, 3, 4, 5, 6]

//        Дан масив [1, 2, 3]. Додайте йому на початок елементи 4, 5, 6.
        int[] arr3 = {1, 2, 3};
        int[] newArr2 = new int[arr3.length + 3];
        System.arraycopy(arr3, 0, newArr2, 3, arr3.length);
        newArr2[0] = 4;
        newArr2[1] = 5;
        newArr2[2] = 6;
        System.out.println(Arrays.toString(newArr2));  // [4, 5, 6, 1, 2, 3]

//        Дан масив [1, 2, 3, 4, 5]. Перетворіть масив на [1, 2, 10, 3, 4, 5].
        int[] arr4 = {1, 2, 3, 4, 5};
        arr4[2] = 10;
        System.out.println(Arrays.toString(arr4));  // [1, 2, 10, 4, 5]

//        Дан масив [3, 4, 1, 2, 7]. Відсортуйте його.
        int[] arr5 = {3, 4, 1, 2, 7};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));  // [1, 2, 3, 4, 7]

//        Дан масив з елементами 'Привіт, ', 'світ' і '!'. Необхідно вивести на екран фразу 'Привіт, світ!'
        String[] arr6 = {"Привіт, ", "світ", "!"};
        String phrase = String.join("", arr6);
        System.out.println(phrase + ";");  // "Привіт, світ!"

//        Створіть масив arr = ['a', 'b', 'c', 'd'] і за допомогою його виведіть на екран рядок 'a+b, c+d'.
        char[] arr7 = {'a', 'b', 'c', 'd'};
        String result = arr7[0] + "+" + arr7[1] + ", " + arr7[2] + "+" + arr7[3];
        System.out.println(result + ";");  // "a+b, c+d"

//        Задание:
//        Напишите сценарий, который найдет в массиве все отрицательные значения и заменить их на значения 0.
//        После этого выведет на экран все элементы массива.
//        int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};

        int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};

        // Заміна від'ємних значень на 0
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                values[i] = 0;
            }
        }

        // Виведення елементів масиву
        for (int value : values) {
            System.out.print(value + " ");
        }

//
//        Задание:
//        Дано массив.Создайте на оснoвое значений этого массива два новых массива.В один массив поместите все четные значения, а во второй все нечетные.
//        Выведите на экран значения, которые вошли в первый массив и во второй массив.
//
//        int[] values = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23};

        int[] values1 = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23};

        List<Integer> evenValues = new ArrayList<>();
        List<Integer> oddValues = new ArrayList<>();

        for (int value : values1) {
            if (value % 2 == 0) {
                evenValues.add(value);
            } else {
                oddValues.add(value);
            }
        }

        System.out.println("\nЕлементи, які входять в перший масив (парні значення):");
        for (int value : evenValues) {
            System.out.print(value + " ");
        }

        System.out.println("\nЕлементи, які входять в другий масив (непарні значення):");
        for (int value : oddValues) {
            System.out.print(value + " ");
        }

//        Задание:
//        Найдите первый положительный элемент массива и выведите его на экран.
//
//        int[] values = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};

        int[] values2 = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};

        int firstPositive = 0;
        boolean foundPositive = false;

        for (int value : values2) {
            if (value > 0) {
                firstPositive = value;
                foundPositive = true;
                break;
            }
        }

        if (foundPositive) {
            System.out.print("\nПерший позитивний елемент масиву: " + firstPositive);
        } else {
            System.out.print("У масиві немає позитивних елементів.");

        }
    }
}