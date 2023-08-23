package ua.hillel.dolhykh.lessons.lesson16;

//import org.junit.jupiter.api.*;
//import ua.hillel.lonzhanskyi.lessons.lesson16.ArrayUtil;
//
//public class TestArrayUtil {
//
//    static int[] array;
//
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("beforeAll");
//        array = new int[]{1, 2, 3, 4, 5};
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("beforeEach ");
//    }
//
//    @Test
//    void testMethod1() {
//        System.out.println("testMethod1");
////        int indexElement = ArrayUtil.getIndexElement(array, 2);
////        Assertions.assertEquals(1, indexElement);
//        Assertions.assertEquals(1, ArrayUtil.getIndexElement(array, 2));
//    }
//
//    @Test
//    void testMethod2() {
//        System.out.println("testMethod2");
//        int[] array = {};
//        Assertions.assertEquals(-2, ArrayUtil.getIndexElement(array, 2));
//    }
//
//    @Test
//    @Disabled("it will be fix soon")
//    void testMethod3() {
//        Assertions.assertEquals(-1, ArrayUtil.getIndexElement(null, 2));
//    }
//
//
//    @Test
//    void testMethod4() {
//        System.out.println("testMethod4");
//        int[] array = {1, 2, 3, 4, 5};
//        Assertions.assertEquals(-1, ArrayUtil.getIndexElement(array, 11));
//    }
//
//    @AfterEach
//    void afterEach() {
//        System.out.println("afterEach ");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("afterAll");
//        array = null;
//    }
//}