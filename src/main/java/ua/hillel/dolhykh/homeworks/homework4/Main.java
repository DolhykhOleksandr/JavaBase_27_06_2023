package ua.hillel.dolhykh.homeworks.homework4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення імені першої команди
        System.out.print("Введіть ім'я першої команди: ");
        String teamBlackHawks = scanner.nextLine();

        // Введення кількості фрагів для гравців першої команди
        int[] fragsPlayersFirstTeam = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть кількість фрагів для гравця " + (i + 1) + ": ");
            fragsPlayersFirstTeam[i] = scanner.nextInt();
        }
        scanner.nextLine();

        // Введення імені другої команди
        System.out.print("Введіть ім'я другої команди: ");
        String teamPittsburghPinguins = scanner.nextLine();
        // Введення кількості фрагів для гравців другої команди
        int[] fragsPlayersSecondTeam = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть кількість фрагів для гравця " + (i + 1) + ": ");
            fragsPlayersSecondTeam[i] = scanner.nextInt();
        }

        // Обчислення середнього арифметичного балів кожної команди
        double averageFirstTeam = calculateAverage(fragsPlayersFirstTeam);
        double averageSecondTeam = calculateAverage(fragsPlayersSecondTeam);

        // Визначення переможця
        String winningTeam;
        double result;
        if (averageFirstTeam > averageSecondTeam) {
            result = averageFirstTeam - averageSecondTeam;
            winningTeam = teamBlackHawks;
        } else if (averageSecondTeam > averageFirstTeam) {
            result = averageSecondTeam - averageFirstTeam;
            winningTeam = teamPittsburghPinguins;
        } else {
            result = 0;
            winningTeam = "Нічия";
        }
        // Виведення результатів
        System.out.println("Перемогла команда " + winningTeam + " набрала " + result + " очків.");

        scanner.close();//Закриваємо сканер
    }

    // Метод для обчислення середнього арифметичного балів
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
