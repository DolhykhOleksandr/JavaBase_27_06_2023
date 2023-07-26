package ua.hillel.dolhykh.lessons.lesson6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //        FOR



        /*

        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
              )
              {
                  код
              }

         */

//        int i = 0;
//        for ( ; ; i++) {
//
//            if (i == 3 || i == 5) {
//                continue;
//            }
//
//            System.out.println(i);
//
//            if (i == 10) {
//                break;
//            }
//        }

//        System.out.println(i);


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ


//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                counter++;
//                System.out.println(counter);
//            }
//        }


//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }


//        for (int i = 0; i < 10; i += 2) {
//            System.out.println(i);
//        }



//        for (byte i = 0;  i < 128 ; i++) {
//            System.out.println(i);
//        }




//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20


        // version 1
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


        // version 2
//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }





//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89


//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//        }





        // WHILE

//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i == 3 || i == 5) {
//                continue;
//            }
//
//            if (i == 7) {
//                break;
//            }
//
//            System.out.println(i);
//        }


//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 15);



//        while (true) {
//            System.out.println("sfdsd");
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        int userValue = -1;
//        while (true) {
//            System.out.println("Please enter integer from 10 to 50");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                if (userValue >= 10 && userValue <= 50) {
//                    break;
//                } else {
//                    System.out.println("FROM 10 TO 50!!!!!!!!!");
////                    scanner.nextLine();
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
////                scanner.nextLine();
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("user value = " + userValue);







//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win
//        int i = 10;
//        while (i >= 0) {
//            int randomNumber = (int) (Math.random() * 101);
//            if (randomNumber >= 85 && randomNumber <= 100) {
//                System.out.println("WIN!!!!!!!!!");
//                break;
//            }
//
//            System.out.println(i);
//
//            if (i == 0) {
//                System.out.println("BOOOOOOOOOOOM!!!!");
//            }
//            i--;
//        }







//        ДЗ
//
//        У Японії числа 4 та 9 вважаються нещасливими.
//        Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.

        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println(i);
            counter++;
        }

        System.out.println("counter: " + counter);

        // 4, 9, 14, 19, 24, 29, 40-49, 54, 104, 109

//        int a = 14;
//        System.out.println(a);
//        System.out.println(a / 10);
//        System.out.println(a % 10);

    }
}

