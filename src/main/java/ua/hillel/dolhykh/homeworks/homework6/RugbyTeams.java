package ua.hillel.dolhykh.homeworks.homework6;

import java.util.Random;

public class RugbyTeams {

    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];


        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            team1[i] = random.nextInt(23) + 18;
            team2[i] = random.nextInt(23) + 18;
        }


        System.out.println("Team 1:");
        for (int age : team1) {
            System.out.print(age + " ");
        }
        System.out.println();
        System.out.println("Team 2:");
        for (int age : team2) {
            System.out.print(age + " ");
        }
        System.out.println();

        int averageAgeTeam1 = 0;
        for (int age : team1) {
            averageAgeTeam1 += age;
        }
        averageAgeTeam1 /= team1.length;

        int averageAgeTeam2 = 0;
        for (int age : team2) {
            averageAgeTeam2 += age;
        }
        averageAgeTeam2 /= team2.length;


        System.out.println("Average age of Team 1: " + averageAgeTeam1);
        System.out.println("Average age of Team 2: " + averageAgeTeam2);
    }
}








