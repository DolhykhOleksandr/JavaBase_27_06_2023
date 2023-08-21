package ua.hillel.dolhykh.homeworks.homework8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків: ");
        int rows = Positive(scanner);
        System.out.println("Введіть кількість стовпців: ");
        int columns = Positive(scanner);

        int[][] matrix = new int[rows][columns];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = readNonNegativeInteger(scanner);
            }
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
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
                if (num < 0) {
                    System.out.println("Число не може бути від'ємним. Введіть ще раз: ");
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
