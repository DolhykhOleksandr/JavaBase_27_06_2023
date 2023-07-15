package ua.hillel.dolhykh.homeworks.homework5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(11);
        int attempts = 1;
        int guessNumber;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a whole number between 0 and 10.");

        while (true) {
            System.out.println("Enter your guess number: ");
            if (scanner.hasNextInt()) {
                guessNumber = scanner.nextInt();
                if (guessNumber == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber
                            + ". In attempts: " + attempts + ".");
                    break;
                } else if (attempts == 3) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
                    break;
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
                ++attempts;

            } else {
                System.out.println("Wrong data! Please enter an integer.");

            }
            scanner.nextLine();

        }
        scanner.close();

    }
}
