package ua.hillel.dolhykh.homeworks.homework5;

public class SpaceShuttleNumbers {
    public static void main(String[] args) {
        System.out.println("Space Shuttle Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (!isUnluckyNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isUnluckyNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}