package ua.hillel.dolhykh.lessons.lesson5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 15;
//
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        boolean result = a != b;
//
//        System.out.println("result = " + result);


//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));



//        int a = 10;
//        int b = 15;
//        int c = 20;
//
//        System.out.println(a < b && b < c && c > a || 5 > 10 && 10 < 9);

//        int a = 5;
//        int b = 10;

//        if (a < b) {
//            System.out.println("qwerty");
//        }

//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a >= b");
//        }
//
//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a == b");
//        }



//        if (a <= b) {
//            System.out.println("a <= b");
//
//            if (a < b) {
//                System.out.println("a < b");
//                if (a < b) {
//                    System.out.println("a < b");
//                }
//            } else if (a == b) {
//                System.out.println("a == b");
//            }
//
//        } else {
//            System.out.println("a > b");
//        }


//        int c = 0;
//
//        if (a < b) {
//            System.out.println(a);
//            System.out.println(b);
//            c = 50;
//            System.out.println("c = " + c);
//        }
//
//        System.out.println(c);

//        int a = 5;
//        int b = 10;

//        if (a < b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//
//       // (умова) ? вираз 1 : вираз 2
//        System.out.println((a > b) ? "YES" : "NO");


//        if (a <= b) {
//            System.out.print("YES 1 ");
//
//            if (a < b) {
//                System.out.println(" YES 2");
//            } else {
//                System.out.println(" NO 2");
//            }
//        } else {
//            System.out.println("NO");
//        }
//
//
//        // (умова) ? вираз 1 : вираз 2
//        System.out.println((a <= b) ? "YES 1" + ((a < b) ? " YES 2" : " NO 2") : "NO");

//        int a = 5;
//        int b = 10;
//
//        // BAD VERSION!!!!!!!!!!!!!!!!!!!!!!!!!
//        if (a > b)
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println("4");
//            System.out.println("5");


//        int a = 11;

//        if (a == 1) {
//            System.out.println(1);
//        } else if (a == 2) {
//            System.out.println(2);
//        } else if (a == 3) {
//            System.out.println(3);
//        } else if (a == 4) {
//            System.out.println(4);
//        } else if (a == 5) {
//            System.out.println(5);
//        } else {
//            System.out.println("default");
//        }

//        int a = 11;
//        switch (a) {
//            case 1: {
//                System.out.println(1);
//                break;
//            }
//            case 2: {
//                System.out.println(2);
//                break;
//            }
//            case 3: {
//                System.out.println(3);
//                break;
//            }
//            case 4: {
//                System.out.println(4);
//                break;
//            }
//            case 5: {
//                System.out.println(5);
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }

//        String str = "QWe";
//        switch (str) {
//            case "QWe": {
//                System.out.println(1);
//                break;
//            }
//            case "QwE": {
//                System.out.println(2);
//                break;
//            }
//            case "QWE": {
//                System.out.println(3);
//                break;
//            }
//        }

        Scanner scanner = new Scanner(System.in);

//        String userValue1 = scanner.next();
//        System.out.println(userValue1);
//        String userValue2 = scanner.nextLine();
//        System.out.println(userValue2);

//        System.out.println("Please enter integer");
//        int userValueInt = 1;
//        if (scanner.hasNextInt()) {
//            userValueInt = scanner.nextInt();
//        } else {
//            System.out.println("Wrong data!");
//            System.exit(0);
//        }
//        System.out.println("user value = " + userValueInt);


        int userValueInt = scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();


        System.out.println(userValueInt);
        System.out.println(str);

    }
}


