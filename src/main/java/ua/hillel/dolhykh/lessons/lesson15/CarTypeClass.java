package ua.hillel.dolhykh.lessons.lesson15;

public class CarTypeClass {

    private String type;

    public static final CarTypeClass CAR = new CarTypeClass("Автомобiль");
    public static final CarTypeClass BUS = new CarTypeClass("Автобус");
    public static final CarTypeClass TRUCK = new CarTypeClass("Вантажiвка");
    public static final CarTypeClass MOTORCYCLE = new CarTypeClass("Мотоцикл");

    private CarTypeClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}