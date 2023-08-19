package ua.hillel.dolhykh.lessons.lesson15;

public enum CarType {
    CAR("Автомобiль"),
    BUS("Автобус"),
    TRUCK("Вантажiвка"),
    MOTORCYCLE("Мотоцикл", 22);

    private String type;
    private int x;

    CarType(String type) {
        this.type = type;
    }

    CarType(String type, int x) {
        this.type = type;
        this.x = x;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }
}