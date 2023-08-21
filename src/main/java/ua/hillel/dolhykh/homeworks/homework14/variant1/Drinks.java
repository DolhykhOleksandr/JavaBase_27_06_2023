package ua.hillel.dolhykh.homeworks.homework14.variant1;


import java.util.Arrays;
import java.util.Scanner;

public class Drinks {

    public static final double COFFEE_PRICE = 19.99;
    public static final double TEA_PRICE = 15.99;
    public static final double LEMONADE_PRICE = 16.99;
    public static final double MOHITO_PRICE = 29.99;
    public static final double SODA_PRICE = 13.49;
    public static final double COLA_PRICE = 13.99;

    public static int drinksCounter = 0;
    public static double sum = 0.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] drinks = DrinksMachine.values();

        DrinksMachine selectedDrink = null;

        newDrink:
        while (true) {

            drinkSelection:
            while (true) {
                System.out.println("Please select the desired drink from the list: " + Arrays.toString(drinks));
                String enteredDrinkName = scanner.nextLine().toUpperCase();

                for (DrinksMachine drink : drinks) {
                    if (drink.toString().equals(enteredDrinkName)) {
                        selectedDrink = DrinksMachine.valueOf(enteredDrinkName);
                        break drinkSelection;
                    }
                }
            }

            switch (selectedDrink) {
                case COFFEE: {
                    makeNewDrink(DrinksMachine.COFFEE);
                    drinksCounter++;
                    sum += COFFEE_PRICE;
                    break;
                }
                case TEA: {
                    makeNewDrink(DrinksMachine.TEA);
                    drinksCounter++;
                    sum += TEA_PRICE;
                    break;
                }
                case LEMONADE: {
                    makeNewDrink(DrinksMachine.LEMONADE);
                    drinksCounter++;
                    sum += LEMONADE_PRICE;
                    break;
                }
                case MOHITO: {
                    makeNewDrink(DrinksMachine.MOHITO);
                    drinksCounter++;
                    sum += MOHITO_PRICE;
                    break;
                }
                case SODA: {
                    makeNewDrink(DrinksMachine.SODA);
                    drinksCounter++;
                    sum += SODA_PRICE;
                    break;
                }
                case COLA: {
                    makeNewDrink(DrinksMachine.COLA);
                    drinksCounter++;
                    sum += COLA_PRICE;
                    break;
                }
            }
            System.out.println("Enter \"yes\" if you want one more drink or \"no\" if you have finished");

            while (true) {
                String userDecision = scanner.nextLine().toLowerCase();
                if ("yes".equals(userDecision)) {
                    continue newDrink;
                } else if ("no".equals(userDecision)) {
                    if (drinksCounter == 1) {
                        System.out.format("You have bought one drink. Total sum is %.2f UAH\n", sum);
                    } else {
                        System.out.format("You have bought %d drinks. Total sum is %.2f UAH\n", drinksCounter, sum);
                    }
                    break newDrink;
                } else {
                    System.out.println("Wrong answer. Please, enter \"yes\" or \"no\"");
                }
            }
        }
        scanner.close();
    }


    public static void makeNewDrink(DrinksMachine drink) {
        System.out.format("Making new drink: %s. Please wait\n", drink.toString().toUpperCase());
    }
}