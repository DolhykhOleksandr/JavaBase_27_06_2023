package ua.hillel.dolhykh.homeworks.algorithm;

import java.util.Stack;

public class AlgorithmAkkerman {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;

        //Реализация с помощью рекурсии
        int resultRecurse = akkermanRecurse(m, n);
        System.out.println("Результат (Рекурсия): " + resultRecurse);

        //Реализация с помощью цикла
        int resultIteration = akkermanIteration(m, n);
        System.out.println("Результат (Цикл): " + resultIteration);
    }

    public static int akkermanRecurse(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return akkermanRecurse(m - 1, 1);
        } else {
            return akkermanRecurse(m - 1, akkermanRecurse(m, n - 1));
        }
    }

    public static int akkermanIteration(int m, int n) {
        //Стек для хранения значения
        Stack<Integer> stack = new Stack<>();
        stack.push(m);

        while (!stack.isEmpty()) {
            m = stack.pop();

            if (m == 0) {
                n = n + 1;
            } else if (m > 0 && n == 0) {
                stack.push(m - 1);
                n = 1;
            } else {
                stack.push(m - 1);
                stack.push(m);
                n = n - 1;
            }
        }

        return n;
    }
}
