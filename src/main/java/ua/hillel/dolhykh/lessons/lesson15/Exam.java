package ua.hillel.dolhykh.lessons.lesson15;


import java.util.Arrays;
import java.util.Scanner;

/*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        C: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
 */
public class Exam {

    public static void main(String[] args) {
        runApp();
        System.out.println("count driver license: " + DriverLicense.counter);
    }

    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        CarType[] carTypes = CarType.values();
        CarType carType = null;
        int years;
        int x = 0;
        while (x <= 2) {
            while (carType == null) {
                System.out.println("Please enter transport type from list: " + Arrays.toString(carTypes));
                String userValue = scanner.nextLine().toUpperCase();
                for (CarType type : carTypes) {
                    if (userValue.equals(type.toString())) {
                        carType = CarType.valueOf(userValue);
                        break;
                    }
                }
            }

            while (true) {
                System.out.println("Please enter driver experience");
                if (scanner.hasNextInt()) {
                    years = scanner.nextInt();
                    scanner.nextLine();

                    if (years >= 0 && years <= 99) {
                        break;
                    } else {
                        System.out.println("Please enter number from 0 to 99");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Please enter correct value!!!");
                    scanner.nextLine();
                }
            }

            boolean ok = false;
            switch (carType) {
                case MOTORCYCLE: {
                    System.out.println("for " + CarType.MOTORCYCLE + " need category " + Category.A);
                    ok = checkYears(years, Category.A);
                    break;
                }
                case CAR: {
                    System.out.println("for " + CarType.CAR + " need category " + Category.B);
                    ok = checkYears(years, Category.B);
                    break;
                }
                case TRUCK: {
                    System.out.println("for " + CarType.TRUCK + " need category " + Category.C);
                    ok = checkYears(years, Category.C);
                    break;
                }
                case BUS: {
                    System.out.println("for " + CarType.BUS + " need category " + Category.D);
                    ok = checkYears(years, Category.D);
                    break;
                }
            }

            if (ok) {
                DriverLicense driverLicence = new DriverLicense();
                System.out.println("Take your driver licence");
            } else {
                System.out.println("You need more drive experience");
            }

            carType = null;
            x++;
        }

    }


    //    А: від 3 років досвіду водіння
//    В: від 0 років досвіду
//    C: від 5 років досвіду
//    D: від 7 років досвіду
    static boolean checkYears(int years, Category category) {
//        boolean ok = false;
//        switch (category) {
//            case A: {
//                if (years >= 3) {
//                    ok = true;
//                }
//                break;
//            }
//            case B: {
//                if (years >= 0) {
//                    ok = true;
//                }
//                break;
//            }
//            case C: {
//                if (years >= 5) {
//                    ok = true;
//                }
//                break;
//            }
//            case D: {
//                if (years >= 7) {
//                    ok = true;
//                }
//                break;
//            }
//
//        }
//        return ok;

        switch (category) {
            case A: {
                return years >= 3;
            }
            case B: {
                return years >= 0;
            }
            case C: {
                return years >= 5;
            }
            case D: {
                return years >= 7;
            }
            default: {
                return false;
            }
        }

    }


}