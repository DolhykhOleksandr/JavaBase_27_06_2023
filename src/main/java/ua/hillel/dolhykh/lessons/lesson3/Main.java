package ua.hillel.dolhykh.lessons.lesson3;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = ++a - b-- + ++a + ++a ;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}


