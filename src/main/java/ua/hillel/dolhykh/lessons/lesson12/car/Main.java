package ua.hillel.dolhykh.lessons.lesson12.car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW");
        car.start();

        car.countWheels = 3;
        car.fuelStatus = 0.0;
        car.isStart = false;

        car.setModelName("sdfsdf");


    }
}