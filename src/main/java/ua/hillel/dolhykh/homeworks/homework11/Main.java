package ua.hillel.dolhykh.homeworks.homework11;

public class Main {

    public static void main(String args[]) {

        System.out.println("ACCOUNT 1");
        new Account("Lena", 27, 3, 1990, "elenasovenko@gmail.com", "0955556677", "Sovenko", 52, "120/70", 10000)
                .printAccountInfo();

        System.out.println("ACCOUNT 2");
        new Account("Iryna", 15, 10, 1971, "irynashekera1510@gmail.com", "0632224433", "Shekera", 60, "120/80", 5000)
                .printAccountInfo();

        System.out.println("ACCOUNT 3");
        new Account("Volodymyr", 22, 10, 1965, "volodymyrbondar2210@gmail.com", "0938887766", "Bondar", 90, "130/80", 8000)
                .printAccountInfo();

        System.out.println("ACCOUNT 4");
        new Account("Liza", 26, 5, 1999, "vita2605@gmail.com", "0964002289", "Lohur", 53, "110/60", 14000)
                .printAccountInfo();

        System.out.println("ACCOUNT 5");
        new Account("Christina", 12, 2, 1971, "chris1971@gmail.com", "0505050053", "Lozina", 48, "120/75", 10000)
                .printAccountInfo();

        System.out.println("ACCOUNT 1 NEW");
        Account lena = new Account("Lena", 27, 3, 1990, "elenasovenko@gmail.com", "0955556677", "Sovenko", 52, "120/70", 10000);
        lena.setSurname("Logvinova");
        lena.setWeight(53);
        lena.setPressure("120/75");
        lena.setStepsPerDay(14000);
        lena.printAccountInfo();

        System.out.println("ACCOUNT 2 NEW");
        Account iryna = new Account("Iryna", 15, 10, 1971, "irynashekera1510@gmail.com", "0632224433", "Shekera", 60, "120/80", 5000);
        iryna.setSurname("Kovtunenko");
        iryna.setWeight(58);
        iryna.setPressure("125/65");
        iryna.setStepsPerDay(10000);
        iryna.printAccountInfo();

    }
}

