package ua.hillel.dolhykh.homeworks.demohomeworks;


//import java.util.Scanner;
//
//public class Homework6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String team1Name;
//        String team2Name;
//        final int COUNT_PLAYERS = 5;
//        int[] team1 = new int[COUNT_PLAYERS];
//        int[] team2 = new int[COUNT_PLAYERS];
//        double sumFragsTeam1 = 0;
//        double sumFragsTeam2 = 0;
//        double avgFragsTeam1 = 0;
//        double avgFragsTeam2 = 0;
//
//        System.out.println("Enter team1 name: ");
//        team1Name = scanner.nextLine();
//
//        System.out.println("Enter team2 name: ");
//        team2Name = scanner.nextLine();
//
//        for (int i = 0; i < team1.length; i++) {
//            System.out.println("Please enter frags for player " + (i + 1) + " from team " + team1Name);
//            team1[i] = getFrags(scanner);
//            sumFragsTeam1 += team1[i];
//        }
//
//        for (int i = 0; i < team2.length; i++) {
//            System.out.println("Please enter frags for player " + (i + 1) + " from team " + team2Name);
//            team2[i] = getFrags(scanner);
//            sumFragsTeam2 += team2[i];
//        }
//
//        System.out.println("sum frags team " + team1Name + ": " + sumFragsTeam1);
//        System.out.println("sum frags team " + team2Name + ": " + sumFragsTeam2);
//
//        avgFragsTeam1 = sumFragsTeam1 / COUNT_PLAYERS;
//        avgFragsTeam2 = sumFragsTeam2 / COUNT_PLAYERS;
//
//        System.out.println("avg frags team " + team1Name + ": " + avgFragsTeam1);
//        System.out.println("avg frags team " + team2Name + ": " + avgFragsTeam2);
//
//        if (avgFragsTeam1 == avgFragsTeam2) {
//            System.out.println("Draw");
//        } else if (avgFragsTeam1 > avgFragsTeam2) {
//            System.out.println("Team " + team1Name + " won");
//        } else {
//            System.out.println("Team " + team2Name + " won");
//        }
//
//        scanner.close();
//    }
//
//    static int getFrags(Scanner scanner) {
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int temp = scanner.nextInt();
//                if (temp >= 0) {
//                    return temp;
//                } else {
//                    System.out.println("Please enter positive number");
//                }
//                scanner.nextLine();
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//        }
//    }






//import java.util.Scanner;
//
//public class Homework7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int randomNumber = (int) (Math.random() * 11);
//        System.out.println("randomNumber = " + randomNumber);
//
//        for (int i = 3; i > 0; i--) {
//            System.out.println("Guess the number, you have " + i + " tries");
//            int number = getNumber(scanner);
//            if (number == randomNumber) {
//                System.out.println("You win!");
//                break;
//            } else if (i == 1) {
//                System.out.println("You lose");
//            }
//        }
//
//        scanner.close();
//    }
//
//    static int getNumber(Scanner scanner) {
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int temp = scanner.nextInt();
//                if (temp >= 0 && temp <= 10) {
//                    return temp;
//                } else {
//                    System.out.println("Please enter number from 0 to 10");
//                }
//                scanner.nextLine();
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//        }
//    }



//public class Homework8 {
//    public static void main(String[] args) {
//        int counter = 0;
//        for (int i = 1; counter < 100 ; i++) {
//            if (checkNumber(i)) {
//                System.out.println("number: " + i);
//                counter++;
//            }
//        }
//        System.out.println("count shuttle: " + counter);
//    }
//
//    static boolean checkNumber(int number) {
//        int result = number % 10;
//        do {
//            if (result == 4 || result == 9) {
//                return false;
//            }
//            number /= 10;
//            result = number % 10;
//        } while (number > 0);
//        return true;
//    }
//
//    static boolean checkNumberVersion2(int number) {
//        String str = String.valueOf(number);
//        return !(str.contains("9") || str.contains("4"));
//    }
//




//import java.util.Arrays;
//
//public class Homework9 {
//    public static void main(String[] args) {
//        int min = 18;
//        int max = 40;
//        final int COUNT_PLAYERS = 25;
//        int[] team1 = new int[COUNT_PLAYERS];
//        int[] team2 = new int[COUNT_PLAYERS];
//        double sumYearsTeam1 = 0;
//        double sumYearsTeam2 = 0;
//        double avgYearsTeam1 = 0;
//        double avgYearsTeam2 = 0;
//
//        for (int i = 0; i < COUNT_PLAYERS; i++) {
//            team1[i] = getRandomNumber(min, max);
//            sumYearsTeam1 += team1[i];
//            team2[i] = getRandomNumber(min, max);
//            sumYearsTeam2 += team2[i];
//        }
//
//        avgYearsTeam1 = sumYearsTeam1 / COUNT_PLAYERS;
//        avgYearsTeam2 = sumYearsTeam2 / COUNT_PLAYERS;
//
//        System.out.println("team1: " + Arrays.toString(team1));
//        System.out.println("team2: " + Arrays.toString(team2));
//        System.out.println("avg team1: " + avgYearsTeam1);
//        System.out.println("avg team2: " + avgYearsTeam2);
//    }
//
//    static int getRandomNumber(int min, int max) {
//        return (int) (Math.random() * (max - min + 1)) + min;
//    }
//}





//import java.util.Arrays;
//
//public class Homework10 {
//    public static void main(String[] args) {
//        int max = 9;
//        final int COUNT = 7;
//        int[] array1 = new int[COUNT];
//        int[] array2 = new int[COUNT];
//
//        for (int i = 0; i < COUNT; i++) {
//            array1[i] = getRandomNumber(max);
//            array2[i] = getRandomNumber(max);
//        }
//
//        System.out.println("Before sort");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//        System.out.println("After sort");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        int counter = 0;
//        for (int i = 0; i < COUNT; i++) {
//            if (array1[i] == array2[i]) {
//                counter++;
//            }
//        }
//        System.out.println();
//        System.out.println("Number of coincidences: " + counter);
//    }
//
//    static int getRandomNumber(int max) {
//        return (int) (Math.random() * (max + 1));
//    }
//}




//import java.util.Scanner;
//
//public class Homework11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = getNumber(scanner);
//        int m = getNumber(scanner);
//
//        int[][] array1 = new int[n][m];
//        int[][] array2 = new int[m][n];
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                array1[i][j] = (int) (Math.random() * 101);
//            }
//        }
//        System.out.println("First array:");
//        printArray(array1);
//
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                array2[i][j] = array1[j][i];
//            }
//        }
//        System.out.println("Second array:");
//        printArray(array2);
//
//        scanner.close();
//    }
//
//    static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//    static int getNumber(Scanner scanner) {
//        int temp = 0;
//        System.out.println("Please enter array length");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                temp = scanner.nextInt();
//                if (temp < 0) {
//                    System.out.println("Please enter positive number");
//                } else {
//                    break;
//                }
//                scanner.nextLine();
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//        }
//        return temp;
//    }
//}