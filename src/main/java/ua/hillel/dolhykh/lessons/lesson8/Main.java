package ua.hillel.dolhykh.lessons.lesson8;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        // O(N)
//        int N = 10;
//        for (int i = 0; i < N; i++) {
//
//        }

        // O(N^2)
//        int counter = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        int counter = 0;
//        for (int i = 0; i < 13; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 3; k++) {
//                    counter++;
//                }
//            }
//        }
//        System.out.println(counter);



//        int counter = 0;
//        int[] array = {5, 1, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6};
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));


//        int[] array = {5, 1, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5, 76, 23, 2, 6};
//
//        boolean swapped = true;
//        int start = 0;
//        int end = array.length;
//        int counter = 0;
//
//
//        while (swapped) {
//            swapped = false;
//            for (int i = start; i < end - 1; i++) {
//                counter++;
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    swapped = true;
//                }
//            }
////            if (!swapped) {
//            if (swapped == false) {
//                break;
//            }
//            end--;
//            for (int i = end - 1; i >= start; i--) {
//                counter++;
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    swapped = true;
//                }
//            }
////            start += 1;
//            start++;
//        }
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));


//        int[] array = {5, 1, 2, 87, 5, 76, 23, 2, 6, 5, 1, 2, 87, 5};
//        Arrays.sort(array);
////        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));


//        int counter = 0;
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int element = 9;
//        int index = -1;

        // O(N)
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if (array[i] == element) {
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println("index = " + index);
//        System.out.println("counter = " + counter);



        // O(logN)
//        int counter = 0;
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int element = 9;
//        int index = -1;
//
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        while (firstIndex <= lastIndex) {
//            counter++;
//
//            int middleIndex = (firstIndex + lastIndex) / 2;
//
//            if (array[middleIndex] == element) {
//                index = middleIndex;
//                break;
//            } else if (array[middleIndex] < element) {
//                firstIndex = middleIndex + 1;
//            } else {
//                lastIndex = middleIndex - 1;
//            }
//        }
//
//        System.out.println("index = " + index);
//        System.out.println("counter = " + counter);

//        int index = Arrays.binarySearch(array, element);
//        System.out.println("index = " + index);


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOf(array, array.length);
//
//        array2[0] = 99;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));

//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOfRange(array, 1, 4);
//
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array.length];
//        System.arraycopy(array, 2, array2, 2, 3);
//
//        System.out.println(Arrays.toString(array2));


    }
}
//public class Homework8 {

//    public static void main(String[] args) {

        // У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
        // Напишіть функцію, яка виводить усі номери таких шатлів.


        // version 1

//        int counter = 0;
//        for (int i = 1000; counter <= 1000; i++) {
//            String numberStr = String.valueOf(i);
//            if (numberStr.contains("4") || numberStr.contains("9")) {
//                continue;
//            }
//            System.out.println(i);
//            counter++;
//        }
//
//        System.out.println("counter = " + --counter);



        // version 2
//        int counter = 0;
//        for (int i = 1; counter < 100; i++) {
//            boolean ok = true;
//            int number = i;
//            while (number > 0) {
//                int result = number % 10;
//                if (result == 4 || result == 9) {
//                    ok = false;
//                    break;
//                }
//                number = number / 10;
//            }
//            if (ok) {
//                System.out.println("shuttle number: " + i);
//                counter++;
//            }
//        }
//        System.out.println("counter = " + counter);

//
//    }
//}