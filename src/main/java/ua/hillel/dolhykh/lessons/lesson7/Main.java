package ua.hillel.dolhykh.lessons.lesson7;



import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];
////        int array2[] = new int[5];
//
//        System.out.println(array.length);
//
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
////        array[11] = 6;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
////        System.out.println(array[5]);


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[]{1, 2, 3, 4, 5};
//
//        System.out.println(array[4]);

//        int[] array = new int[10];
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);


//        int[] array = new int[20];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 5 || array[i] == 10 || array[i] == 15) {
//                array[i] = 77;
//            }
////            System.out.println(array[i]);
//        }

//        System.out.println(Arrays.toString(array));


//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//            System.out.println(value);
//        }



//        int[] array = new int[0];       // array.length = 0
//        int[] array2 = new int[-1];   // NegativeArraySizeException




        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[array.length];

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        array2[0] = 99;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));








//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому


//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//        }


/*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/


////        int[] people = new int[10];
//        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 98, 6};
//
////        for (int i = 0; i < people.length; i++) {
////           people[i] = (int) (Math.random() * 101);
////        }
//
//        System.out.println(Arrays.toString(people));
//
//        int max = people[0];
//
//        for (int i = 0; i < people.length; i++) {
//            if (max < people[i]) {
//                max = people[i];
//            }
//        }
//
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] == max) {
//                System.out.println("max chance: " + max + " index: " + i);
//            }
//        }


/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.
*/

//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//
//        System.out.println(Arrays.toString(team));
//
//        int sumTeamMain = 0;
//        int sumTeamReserv = 0;
//        for (int i = 0; i < team.length; i += 2) {
//            sumTeamMain += team[i];
////            sumTeamMain = sumTeamMain + team[i];
//        }
//
//        for (int i = 1; i < team.length; i += 2) {
//            sumTeamReserv += team[i];
//        }

//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                sumTeamMain += team[i];
//            } else {
//                sumTeamReserv += team[i];
//            }
//        }


//        System.out.println("main = " + sumTeamMain);
//        System.out.println("reserv = " + sumTeamReserv);
//
//
//        if (sumTeamMain > sumTeamReserv) {
//            System.out.println("Main win!");
//        } else if (sumTeamReserv > sumTeamMain) {
//            System.out.println("Reserv win");
//        } else {
//            System.out.println("Draw");
//        }


    }
}