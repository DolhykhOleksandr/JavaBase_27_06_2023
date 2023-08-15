package ua.hillel.dolhykh.homeworks.homework13.variant1;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone is calling...");
    }

    @Override
    public void sms() {
        System.out.println("iPhone is sending an sms...");
    }

    @Override
    public void internet() {
        System.out.println("iPhone is connecting to Internet...");
    }

    @Override
    public void IOSOperation() {
        System.out.println("iPhone is operating under iOS");
    }
}