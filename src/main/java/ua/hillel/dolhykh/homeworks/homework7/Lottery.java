package ua.hillel.dolhykh.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {

        int[] lotteryNumbers = new int[7];
        int[] playerNumbers = new int[7];

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            lotteryNumbers[i] = random.nextInt(10);
            playerNumbers[i] = random.nextInt(10);
        }

        System.out.println("Перший масив: " + Arrays.toString(lotteryNumbers));
        System.out.println("Другий масив: " + Arrays.toString(playerNumbers));

        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);

        System.out.println("Відсортований перший масив: " + Arrays.toString(lotteryNumbers));
        System.out.println("Відсортований другий масив: " + Arrays.toString(playerNumbers));

        int numberOfMatches = 0;

        for (int i = 0; i < 7; i++) {
            if (lotteryNumbers[i] == playerNumbers[i]) {
                numberOfMatches++;
                System.out.println("Індекс " + i + " = елементу масиву зі значенням " + lotteryNumbers[i]);
            }

        }

        System.out.print("Кількість збігів: " + numberOfMatches);
    }
}






