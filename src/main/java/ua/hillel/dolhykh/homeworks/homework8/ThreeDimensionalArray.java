package ua.hillel.dolhykh.homeworks.homework8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ThreeDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмірність по X:");
        int X = Positive(scanner);
        System.out.println("Введіть розмірність по Y:");
        int Y = Positive(scanner);
        System.out.println("Введіть розмірність по Z:");
        int Z = Positive(scanner);

        int[][][] threeDimensionalArray = new int[X][Y][Z];

        System.out.println("Введіть елементи тривимірного масиву:");
        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    threeDimensionalArray[x][y][z] = readNonNegativeInteger(scanner);
                }
            }
        }

        System.out.println("Тривимірний масив:");
        printThreeDimensionalArray(threeDimensionalArray);

        scanner.close();
    }

    private static void printThreeDimensionalArray(int[][][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                for (int z = 0; z < array[x][y].length; z++) {
                    System.out.print(array[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static int Positive(Scanner scanner) {
        int num;
        while (true) {
            try {
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Число повинно бути додатнім(Не може бути від'ємним або нулем). Введіть ще раз: ");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введіть ціле число: ");
                scanner.next();
            }
        }
        return num;
    }

    private static int readNonNegativeInteger(Scanner scanner) {
        int num;
        while (true) {
            try {
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Число не може бути від'ємним або нулем. Введіть ще раз: ");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введіть ціле число: ");
                scanner.next();
            }
        }
        return num;
    }
}
