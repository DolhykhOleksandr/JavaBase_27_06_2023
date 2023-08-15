package ua.hillel.dolhykh.lessons.lesson13.good.demo;

public class Main {
    public static void main(String[] args) {

        Class1 object = null;

        if (object != null) {
            object.methodFromClass1();
//        ((Class2) object).methodFromClass2();
//        ((Class3) object).methodFromClass3();
//        ((Class4) object).methodFromClass4();

            if (object instanceof Class4) {
                ((Class4) object).methodFromClass4();
            }
        }

    }
}