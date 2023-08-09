package ua.hillel.dolhykh.lessons.lesson11;

public class AircraftFactory {

//        Фабрика літаків
//        a. Параметри літаків:
//        String type = "Jet";s
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        b. Фабрика випускає три типи літаків:
//        винищувачі: тип + ім'я
//        пасажирські без бізнес класу: тип + ім'я + кільк. пасажирів 2-го класу
//        пасажирські з бізнес класом: тип + ім'я + кільк. пасажирів 1 класу + кільк. пасажирів 2-го класу
//        c. Зробити три конструктори для кожного типу літака
//        AirCraftFactory("Jet", "F52");
//        AirCraftFactory("Boeing", "747", 300);
//        AirCraftFactory("Boeing", "747", 300, 25);
//        d. Пiсля строрення лiтака повинно виводити на екран параметри літака

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Jet", "F52");
        Airplane airplane2 = new Airplane("Boeing", "747", 300);
        Airplane airplane3 = new Airplane("Boeing", "747", 300, 25);
    }

}