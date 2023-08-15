package ua.hillel.dolhykh.homeworks.homework13.variant1;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android is calling...");
    }

    @Override
    public void sms() {
        System.out.println("Android is sending a sms...");
    }

    @Override
    public void internet() {
        System.out.println("Android is connecting to Internet...");
    }

    @Override
    public void linuxOSOperation() {
        System.out.println("Android is operating under LinuxOS");
    }
}