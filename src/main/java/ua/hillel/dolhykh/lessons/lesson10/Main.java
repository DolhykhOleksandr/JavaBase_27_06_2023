package ua.hillel.dolhykh.lessons.lesson10;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String strName = "Den";

//        print();
//        printHelloWithName(strName);

//        int x = 10;
//        System.out.println("x = " + x);
//        changeInt(x);
//        System.out.println("x = " + x);


//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(array));
//        demoMethod(array);
//        System.out.println(Arrays.toString(array));


//        printSum(1, 2, 4);

//        printSumAll(1, 2, 3, 4, 5, 6, 7, 8);
//        printSumAll(1, 2);
//        printSumAll(1, 2, 3, 4);
//        printSumAll();

//        printSumAll2(1, 2, 3, 4);

//        int[] array = {1, 2, 3};
//        System.out.println(Arrays.toString(array));
//        changeElementNumbers(array);
//        System.out.println(Arrays.toString(array));

//        double sum = getSum(1, 2, 3.0);
//        System.out.println(sum);


//        badDemoRecursion();
//        demoRecursion(4);

//        demoRecursion2(5);


//        5! = 1 * 2 * 3 * 4 * 5;
//
//        3! = 1 * 2 * 3;

//        int N = 5;
//
//        int factorial = 1;
//        for (int i = N; i >= 1; i--) {
//            factorial *= i;
//        }
//
//        System.out.println(factorial);
//
//
//        System.out.println(getFactorial(5));


        System.out.println(evclide(15, 19));

    }


    static int evclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return evclide(n - m, m);
        } else {
            return evclide(n, m - n);
        }
    }


    static int getFactorial(int N) {
        if (N == 1) {
            return 1;
        }
        return N * getFactorial(N - 1);
    }


    static void demoRecursion2(int x) {
        System.out.println(x);
        if (x > 0) {
            demoRecursion2(--x);
        }
    }


    static void demoRecursion(int counter) {
        System.out.println("Hello");
        counter--;
        if (counter > 0) {
            demoRecursion(counter);
        }

    }


    static void badDemoRecursion() {
        System.out.println("sdfgsdsdfdsfds");
        badDemoRecursion();
    }


    static double getSum(double a, double b, double c) {
        double sum = a + b + c;

        return sum;
    }

    static double getSum(double a, int b, double c) {
        double sum = a + b + c;

        return sum;
    }

    static double getSum(int a, int b, double c) {
        double sum = a + b + c;

        return sum;
    }

    static int getSum(int a, int b, int c) {
        int sum = a + b + c;

        return sum;
    }

    static int getSum(int a, int b) {
        int sum = a + b;

        return sum;
    }


    static void changeElementNumbers(int... numbers) {
        numbers[0] = 99;
    }

    static void printSumAll2(int a, int b, int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }

    // varArgs
    static void printSumAll(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }


    static void printSum(int a, int b, double c) {
        System.out.println(a + b + c);
    }

    static void demoMethod(int[] array) {
        array[0] = 99;
    }

    static void changeInt(int x) {
        x = 20;
    }

    static void print() {
        System.out.println("Hello World!!!");
    }

    static void printHelloWithName(String name) {
        System.out.println("Hello " + name);
    }

}