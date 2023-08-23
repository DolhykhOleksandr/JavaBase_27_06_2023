package ua.hillel.dolhykh.lessons.lesson16;

public class ArrayUtil {

    // if not found - return -1
    // if empty - return -2
    // if null - return -3
    public static int getIndexElement(int[] array, int element) {
        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }



}