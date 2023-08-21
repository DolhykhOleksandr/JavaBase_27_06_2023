package ua.hillel.dolhykh.homeworks.homework14.variant2;

import java.util.Arrays;
import java.util.Scanner;

public class DrinksMain {

    public static void main(String[] args) {
        Drinks order = new Drinks();
        DrinksMachine[] drinks = DrinksMachine.values();
        String answer;
        boolean working = true;

        Scanner in = new Scanner(System.in);

        System.out.print("Do you want some drink? Please type 'y' for YES or 'n' for NO: ");
        while (working) {
            answer = in.nextLine().trim();

            if ("y".equals(answer)) {
                boolean tryAgain = true;
                while (tryAgain) {
                    System.out.println("Enter a drink from the list:");
                    System.out.println(Arrays.toString(drinks));

                    String input = in.nextLine();

                    boolean isPresent = checkDrink(drinks, input);

                    if (isPresent) {
                        prepare(order, input);
                        tryAgain = false;
                    } else {
                        System.out.println("Sorry, we have no " + input);
                        boolean validResponse = false;
                        while (!validResponse) {
                            System.out.println("Do you want to try again? Please type 'y' for YES or 'n' for NO: ");
                            String retry = in.nextLine().trim();
                            if ("y".equals(retry)) {
                                validResponse = true;
                            } else if ("n".equals(retry)) {
                                validResponse = true;
                                tryAgain = false;
                                System.out.println("Thanks for your order! You bought: " + order.getAmountOfDrinks() + " drinks.  Final sum: " + order.getBill());
                                working = false;
                            } else {
                                System.out.println("Sorry, I didn't catch that.");
                            }
                        }

                    }
                }
            } else if ("n".equals(answer)) {
                System.out.println("Thanks for your order! You bought: " + order.getAmountOfDrinks() + " drinks.  Final sum: " + order.getBill());
                working = false;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
        in.close();
    }

    private static void prepare(Drinks order, String input) {
        DrinksMachine choice = DrinksMachine.valueOf(input.toUpperCase());
        switch (choice) {
            case TEA:
                order.prepareTea();
                break;
            case COFFEE:
                order.prepareCoffee();
                break;
            case MOJITO:
                order.prepareMojito();
                break;
            case LEMONADE:
                order.prepareLemonade();
                break;
            case MINERAL:
                order.prepareMineral();
                break;
            case COCA_COLA:
                order.prepareCocaCola();
                break;
            default:
                System.out.println("We didn't prepare anything.");
                break;
        }
        System.out.println("You've already bought " + order.getAmountOfDrinks() + " drinks, it's worth: " + order.getBill());
        System.out.print("Do you want more drinks? Please type 'y' for YES or 'n' for NO: ");
    }


    private static boolean checkDrink(DrinksMachine[] drinks, String input) {
        boolean isPresent = false;
        for (DrinksMachine drink : drinks) {
            if (drink.name().equalsIgnoreCase(input)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }
}