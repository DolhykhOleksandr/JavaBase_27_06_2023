package ua.hillel.dolhykh.homeworks.test1;

public class Main {


    public static void main(String[] args) {
       /* Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2022;
        myCar.start();*/ // можно удалить и все равно унаследуем или можно не удалять


        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.brand = "Tesla";
        myElectricCar.year = 2023;
        myElectricCar.batteryCapacity = 75;
        myElectricCar.start();
        myElectricCar.charge();
        System.out.println(myElectricCar.brand);
    }
}








