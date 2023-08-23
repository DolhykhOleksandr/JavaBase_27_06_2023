package ua.hillel.dolhykh.homework15.variant2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.dolhykh.homeworks.homework15.variant2.ArrayUtil;

public class TestArrayUtil {


    @Test
    public void test1(){
        Assertions.assertTrue(ArrayUtil.getAveregeArray(new int[]{1,2,3,4}) != 0);

    }

    @Test
    public void test2(){
        Assertions.assertFalse(ArrayUtil.compareArrays(1,2));
    }

    @Test
    public void test3(){
        Assertions.assertTrue(ArrayUtil.compareArrays(2,2));
    }

}