package ua.hillel.dolhykh.lessons.lesson12.car2;

import ua.hillel.dolhykh.lessons.lesson12.car.Car;

public class ChildCar extends Car {
    public ChildCar(String modelName) {
        super(modelName);
    }

    void demo() {
        System.out.println(isStart);
    }
}