package ua.hillel.dolhykh.homeworks.homework13.variant2;

public class Iphones implements Smartphones, IOS {

    @Override
    public void call() {
        System.out.println("I am an IOS");
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
    public void personalize() {
        System.out.println("I can personalize your data");
    }
}