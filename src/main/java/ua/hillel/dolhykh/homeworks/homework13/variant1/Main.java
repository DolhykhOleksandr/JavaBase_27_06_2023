package ua.hillel.dolhykh.homeworks.homework13.variant1;

public class Main {
    public static void main(String[] args) {
        Androids android1 = new Androids();
        IPhones iPhone1 = new IPhones();

        android1.call();
        android1.internet();
        android1.sms();
        android1.linuxOSOperation();

        System.out.println();

        iPhone1.call();
        iPhone1.internet();
        iPhone1.sms();
        iPhone1.IOSOperation();
    }
}