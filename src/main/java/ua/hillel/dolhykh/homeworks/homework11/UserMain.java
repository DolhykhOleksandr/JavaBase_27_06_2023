package ua.hillel.dolhykh.homeworks.homework11;

public class UserMain {

    public static void main(String[] args) {
        User tetiana = new User("Tetiana", 4, 11, 1998, "sichkartetiana@hotmail.com", "0509876543", "Sichkar", 56,
                "120/80", 8000);
        User jon = new User("Jon", 4, 10, 1987, "jonjones1987@bigmir.net", "0637776893", "Jones", 100, "110/80", 10000);
        User alex = new User("Alex", 4, 12, 1993, "alexbodnar94@gmail.com", "0675908733", "Bodnar", 93, "120/70",
                12000);

        tetiana.printAccountInfo();
        jon.printAccountInfo();
        alex.printAccountInfo();

        tetiana.setLastName("Tsurenko");
        tetiana.setWeight(58);
        tetiana.setBloodPressure("110/70");
        tetiana.setNumberOfStepsPerDay(10000);

        tetiana.printAccountInfo();

        jon.setWeight(98);
        jon.setBloodPressure("110/70");
        jon.setNumberOfStepsPerDay(12000);

        jon.printAccountInfo();
    }
}