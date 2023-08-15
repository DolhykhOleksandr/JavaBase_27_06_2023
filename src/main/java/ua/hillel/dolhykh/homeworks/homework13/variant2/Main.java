package ua.hillel.dolhykh.homeworks.homework13.variant2;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.listen();

        System.out.println("———————————————————————————");

        Iphones iphones = new Iphones();
        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.personalize();

    }
}