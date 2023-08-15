package ua.hillel.dolhykh.homeworks.homework13.variant2;

public class Androids implements Smartphones, LinuxOs {

    @Override
    public void call() {
        System.out.println("I am an Android");
        System.out.println("I can do calls");
    }

    @Override
    public void sms() {
        System.out.println("I can write the sms");
    }

    @Override
    public void internet() {
        System.out.println("I can use the Internet");
    }

    @Override
    public void listen() {
        System.out.println("I can listen your voice");
    }
}