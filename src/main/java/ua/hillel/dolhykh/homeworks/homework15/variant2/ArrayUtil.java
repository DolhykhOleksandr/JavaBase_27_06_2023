package ua.hillel.dolhykh.homeworks.homework15.variant2;

public class ArrayUtil {

    public static double getAveregeArray(int[] array) {

        if (array == null) {
            System.out.println("wrong data");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 6));
        }
        double n = 0;
        double m = 0;

        for (int i = 0; i < array.length; i++) {
            m += array[i];
        }
        System.out.println(m);
        n = m / array.length;
        return n;
    }


    public static boolean compareArrays(int n, int b) {

        int[][] array = new int[n][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int)(Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        if (array == null){
            System.out.println("wrong data");
            System.exit(0);
        }

        if(n == 0){
            System.out.println("wrong data");
            System.exit(0);
        }

        if (b == 0){
            System.out.println("wrong data");
            System.exit(0);
        }

        if (n == b) {
            System.out.println("yes");
            return true;

        } else {
            System.out.println("no");
            return false;

        }


    }

}