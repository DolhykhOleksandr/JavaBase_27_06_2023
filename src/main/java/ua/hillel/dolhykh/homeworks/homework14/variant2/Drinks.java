package ua.hillel.dolhykh.homeworks.homework14.variant2;

public class Drinks {
    public  final int TEA = 10;
    public  final int COFFEE = 20;
    public  final int MOJITO = 30;
    public  final int LEMONADE = 40;
    public  final int MINERAL = 50;
    public  final int COCA_COLA = 60;

    private int bill;
    private  int amountOfDrinks;

    public int getBill() {
        return bill;
    }

    public int getAmountOfDrinks() {
        return amountOfDrinks;
    }

    public void prepareTea() {
        System.out.println("Preparing tea...");
        this.bill += TEA;
        amountOfDrinks++;
    }

    public void prepareCoffee() {
        System.out.println("Preparing coffee...");
        this.bill += COFFEE;
        amountOfDrinks++;
    }

    public void prepareMojito() {
        System.out.println("Preparing mojito...");
        this.bill += MOJITO;
        amountOfDrinks++;
    }

    public void prepareLemonade() {
        System.out.println("Preparing lemonade...");
        this.bill += LEMONADE;
        amountOfDrinks++;
    }

    public void prepareMineral() {
        System.out.println("Preparing mineral...");
        this.bill += MINERAL;
        amountOfDrinks++;
    }

    public void prepareCocaCola() {
        System.out.println("Preparing coca-cola...");
        this.bill += COCA_COLA;
        amountOfDrinks++;
    }
}