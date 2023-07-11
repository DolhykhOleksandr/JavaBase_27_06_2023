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
            int userValueInt = 1;
            if (scanner.hasNextInt()) {
                userValueInt = scanner.nextInt();
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            fragsPlayersFirstTeam[i] = userValueInt;

        }

        // Введення імені другої команди
        System.out.print("Введіть ім'я другої команди: ");
        scanner.nextLine(); // Consume the newline character
        String teamPittsburghPinguins = scanner.nextLine();

        // Введення кількості фрагів для гравців другої команди
        int[] fragsPlayersSecondTeam = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть кількість фрагів для гравця " + (i + 1) + ": ");
            int userValueInt = 1;
            if (scanner.hasNextInt()) {
                userValueInt = scanner.nextInt();
            } else {
                System.out.println("Wrong data!");
                System.exit(0);
            }
            fragsPlayersSecondTeam[i] = userValueInt;

        }

        // Обчислення середнього арифметичного балів кожної команди
        int averageFirstTeam = calculateAverage(fragsPlayersFirstTeam);
        int averageSecondTeam = calculateAverage(fragsPlayersSecondTeam);

        // Визначення переможця
        String winningTeam;
        int result;
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
        System.out.println("Перемогла команда " + winningTeam + ", набравши " + result + " очків.");

        scanner.close(); // Закриваємо сканер
    }

    // Метод для обчислення середнього арифметичного балів
    public static int calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}

