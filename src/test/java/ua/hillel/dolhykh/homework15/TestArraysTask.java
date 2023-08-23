package ua.hillel.dolhykh.homework15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.hillel.dolhykh.homeworks.homework15.ArraysTask;


public class TestArraysTask {

    static int[] array = null;
    static double meanValue = 0.0;
    static double sum = 0.0;

@BeforeAll
public static void beforeAll() {
    //for mean value
    array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i : array) {
        sum += i;
    }
    meanValue = sum / array.length;
}

    //for mean value
@Test
public void test1() {
    Assertions.assertEquals(meanValue, ArraysTask.meanValue(array));
}

    @Test
    public void test2() {
        Assertions.assertEquals(0.0, ArraysTask.meanValue(new int[0]));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(0.0, ArraysTask.meanValue(null));
    }

    //for square check
    @Test
    public void test4() {
        Assertions.assertTrue(ArraysTask.squareArrayCheck(new int[3][3]));
    }

    @Test
    public void test5() {
        Assertions.assertFalse(ArraysTask.squareArrayCheck(new int[0][0]));
    }

    @Test
    public void test6() {
        Assertions.assertFalse(ArraysTask.squareArrayCheck(null));
    }
}