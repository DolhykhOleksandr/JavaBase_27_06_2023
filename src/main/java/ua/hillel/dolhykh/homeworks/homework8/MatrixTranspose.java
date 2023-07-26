package ua.hillel.dolhykh.homeworks.homework8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків M: ");
        int M = readPositiveInteger(scanner);
        System.out.println("Введіть кількість стовпців N: ");
        int N = readPositiveInteger(scanner);

        int[][] originalMatrix = new int[M][N];
        int[][] transposedMatrix = new int[N][M];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                originalMatrix[i][j] = readNonNegativeInteger(scanner);
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("Оригінальна матриця:");
        printMatrix(originalMatrix);

        System.out.println("Транспонована матриця:");
        printMatrix(transposedMatrix);

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

    private static int readPositiveInteger(Scanner scanner) {
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






