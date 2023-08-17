package ua.hillel.dolhykh.lessons.lesson14.classes;

public class Car {

    private String modelName;
    private static String staticModelName;
    private Engine engine;

    public Car(String modelName) {
        this.modelName = modelName;
        engine = new Engine(5.5);
    }

    private void demoCarMethod() {
        System.out.println("method from Car");

        if (true) {
            class LocalClass {
                int x;

                public LocalClass(int x) {
                    this.x = x;
                }

                void demoLocalClassMethod() {

                }
            }

            LocalClass localClass = new LocalClass(2);
            localClass.demoLocalClassMethod();
        }

    }

    private static void demoCarMethod2() {
        System.out.println("method from Car");
    }




    class Engine {
        double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        void start() {
            System.out.println(modelName);
            demoCarMethod();
            System.out.println(staticModelName);
            System.out.println("Engine start");
        }

        void stop() {
            System.out.println("Engine stop");
        }
    }

    static class Wheel {
        static double staticObemTusky = 20;
        double obemTusky = 20;

        static void demoStaticMethod() {
            System.out.println("demoStaticMethod");
            demoCarMethod2();
            System.out.println(staticModelName);
        }

        void demoNonStaticMethod() {
            System.out.println("demoNonStaticMethod");
        }
    }

}