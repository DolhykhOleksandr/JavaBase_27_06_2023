package ua.hillel.dolhykh.homeworks.homework10;
public class BurgerMain {
    public static void main(String[] args) {

        Burger ordinaryBurger = new Burger("Bun", "Beef", "Cheddar", "Lettuce", "Mayonnaise");
        Burger dietBurger = new Burger("Bun", "Beef", "Cheddar", "Lettuce");
        Burger doubleMeatBurger = new Burger("Bun", "Beef", " and Turkey", "Cheddar", "Lettuce", "Mayonnaise");

    }
}

