package ua.hillel.dolhykh.homeworks.homework15;

public class ArraysTask {

    // if array is null or empty - return 0.0;
    public static double meanValue(int[] array) {
        double sum = 0.0;

        if (array == null || array.length == 0) {
            return 0.0;
        }

        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    // if array is square - return true
    public static boolean squareArrayCheck(int[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayLength != array[i].length) {
                return false;
            }
        }
        return true;
    }
}