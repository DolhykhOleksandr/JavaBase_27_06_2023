package ua.hillel.dolhykh.homeworks.homework5;

import java.util.ArrayList;
import java.util.List;

public class ShuttleNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            String numberStr = String.valueOf(i);
            if (!numberStr.contains("4") && !numberStr.contains("9")) {
                numbers.add(i);
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}