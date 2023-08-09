package ua.hillel.dolhykh.lessons.lesson12.car;

public class Car {

    public int countWheels;
    protected boolean isStart;
    double fuelStatus;
    private String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPS();
    }

    protected void startElectronicSystem() {
        System.out.println("startElectronicSystem");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }

    private void startGPS() {
        System.out.println("startGPS");
    }

    public int getCountWheels() {
        return countWheels;
    }

    public boolean isStart() {
        return isStart;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public String getModelName() {
        return modelName;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    public void setFuelStatus(double fuelStatus) {
        this.fuelStatus = fuelStatus;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}