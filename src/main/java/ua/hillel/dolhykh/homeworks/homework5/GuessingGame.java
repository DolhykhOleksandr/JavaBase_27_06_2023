package ua.hillel.dolhykh.homeworks.homework5;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 11);
        int attempts = 0;
        int guessNumber;

        while (attempts < 3) {
            System.out.println("Guess a number between 0 and 10: ");
            if (scanner.hasNextInt()) {
                guessNumber = scanner.nextInt();
                if (guessNumber == number) {
                    System.out.println("Congratulations! You guessed the number correctly! in " + (attempts + 1) + " attempts.");
                    break;
                } else if (guessNumber < number) {
                    System.out.println("Your guess is too low.");
                } else if (guessNumber > number) {
                    System.out.println("Your guess is too high.");
                }
                ++attempts;

            } else {
                System.out.println("Wrong data! Please enter an integer.");

            }
            scanner.nextLine();
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of attempts. The number was: " + number);
        }

        scanner.close();
    }
}
