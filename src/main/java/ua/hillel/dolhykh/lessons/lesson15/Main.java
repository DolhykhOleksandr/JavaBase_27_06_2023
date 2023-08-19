package ua.hillel.dolhykh.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CarTypeClass car = new CarTypeClass("Автомобiль");

//        System.out.println(CarTypeClass.CAR.getType());
//        System.out.println(CarTypeClass.MOTORCYCLE.getType());


//        System.out.println(CarType.CAR.getType());
//        System.out.println(CarType.BUS);
//        System.out.println(CarType.TRUCK);
//        System.out.println(CarType.MOTORCYCLE);
//
//        System.out.println(CarType.CAR.getType());
//        System.out.println(CarType.CAR.getX());
//
//
//        System.out.println(Arrays.toString(CarType.values()));
//
//        CarType[] carTypes = CarType.values();
//
//        for (CarType carType : carTypes) {
//            System.out.println(carType.getType());
//            System.out.println(carType.getX());
//        }

        Scanner scanner = new Scanner(System.in);


        CarType[] carTypes = CarType.values();
        CarType userCarType = null;
        while (true) {
            System.out.println("Please enter car type from list " + Arrays.toString(carTypes));
            String userValue = scanner.nextLine().toUpperCase();

            for (CarType carType : carTypes) {
                if (userValue.equals(carType.toString())) {
                    userCarType = CarType.valueOf(userValue);
//                    System.out.println(userCarType);
//                    System.out.println(userCarType.getType());
                    break;
                }
            }
            if (userCarType != null) {
                break;
            }
        }


        switch (userCarType) {
            case CAR: {
                System.out.println(CarType.CAR);
                System.out.println(CarType.CAR.getType());
                break;
            }
            case BUS: {
                System.out.println(CarType.BUS);
                System.out.println(CarType.BUS.getType());
                break;
            }
            case TRUCK: {
                System.out.println(CarType.TRUCK);
                System.out.println(CarType.TRUCK.getType());
                break;
            }
            case MOTORCYCLE: {
                System.out.println(CarType.MOTORCYCLE);
                System.out.println(CarType.MOTORCYCLE.getType());
                break;
            }
            default: {
                System.out.println("not found!!!");
                break;
            }

        }

    }
}