package ua.hillel.dolhykh.homeworks.homework6;

import java.util.Random;

public class RugbyTeams1 {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        int[] team1 = generateTeam(teamSize, minAge, maxAge);
        int[] team2 = generateTeam(teamSize, minAge, maxAge);

        System.out.println("Вік гравців команди 1:");
        printArray(team1);
        System.out.println("\nВік гравців команди 2:");
        printArray(team2);

        double averageAge1 = calculateAverageAge(team1);
        double averageAge2 = calculateAverageAge(team2);

        System.out.println("\nСередній вік команди 1: " + averageAge1);
        System.out.println("Середній вік команди 2: " + averageAge2);
    }

    public static int[] generateTeam(int teamSize, int minAge, int maxAge) {
        int[] teamAges = new int[teamSize];
        Random random = new Random();

        for (int i = 0; i < teamSize; i++) {
            teamAges[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }

        return teamAges;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static double calculateAverageAge(int[] team) {
        int sum = 0;

        for (int value : team) {
            sum += value;
        }

        return (double) sum / team.length;
    }
}














