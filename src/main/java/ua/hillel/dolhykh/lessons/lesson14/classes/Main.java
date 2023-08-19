package ua.hillel.dolhykh.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("BMW");
//
//        Car.Wheel wheel = new Car.Wheel();
//        wheel.demoNonStaticMethod();
//        System.out.println(wheel.obemTusky);
//
//        System.out.println(Car.Wheel.staticObemTusky);
//        Car.Wheel.demoStaticMethod();





        AbstractClass abstractClass = new AbstractClass() {

            @Override
            public void methodFromClass() {
                System.out.println("methodFromClass");
            }

            @Override
            public void methodFromClass2() {

            }

            @Override
            public void methodFromClass3() {

            }
        };

        abstractClass.methodFromClass();


        MyInterface myInterface = new MyInterface() {
            @Override
            public void methodFromInterface() {
                System.out.println("methodFromInterface");
            }
        };

       myInterface.methodFromInterface();

    }
}