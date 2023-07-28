package ua.hillel.dolhykh.lessons.lesson9;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

//        int[][] array = new int[3][3];
//
////        array[1][2] = 77;
//
////        System.out.println(Arrays.deepToString(array));
//
//        int number = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = number;
//                number++;
//            }
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] array = new int[5][6];

//        System.out.println(array.length);
//        System.out.println(array[0].length);

//        int number = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = number;
//                number++;
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println(Arrays.toString(array[3]));


//        int[][] array = {
//                {1, 2, 3},
//                {4},
//                {5, 6, 7, 8, 9},
//                {},
//                {10, 11}
//        };


//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//        System.out.println(array[4].length);

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // TASK 1

// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//       0 1 2 3 4

//0      1 0 0 0 0  //00
//1      0 1 0 0 0  //11
//2      0 0 1 0 0  //22
//3      0 0 0 1 0  //33
//4      0 0 0 0 1  //44

//      0 1 2 3 4

//0      0 0 0 0 1  // 04
//1      0 0 0 1 0  // 13
//2      0 0 1 0 0  // 22
//3      0 1 0 0 0  // 31
//4      1 0 0 0 0  // 40

//        int[][] array = new int[5][5];

        // variant 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // variant 2
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }

        // variant 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }


        // variant 2
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//        }


        // variant 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][array[i].length - 1 - i] = 1;
//            // 0 4
//            // 1 3
//            // 2 2
//            // 3 1
//            // 4 0
//        }


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // TASK 2

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W  //00, 02, 04, 06   0, 2, 4, 6
//      W B W B W B W B  //11, 13, 15, 17   2, 4, 6, 8
//      B W B W B W B W  //20, 22, 24, 26   2, 4, 6, 8
//      W B W B W B W B  //31, 33, 35, 37   4, 4,
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B


//        char[][] chess = new char[8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
////                if ((i + j) % 2 == 0) {
////                    chess[i][j] = 'B';
////                } else {
////                    chess[i][j] = 'W';
////                }
//                chess[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };


//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[0][0].length);

//        System.out.println(array[2][0][3]);


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


//        int[][][][] array =
//                {
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//                                }
//                        },
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//                                }
//                        }
//                };

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    for (int l = 0; l < array[i][j][k].length; l++) {
//                        System.out.print(array[i][j][k][l] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


    }

}





