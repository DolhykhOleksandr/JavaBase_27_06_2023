package ua.hillel.dolhykh.lessons.lesson3;



public class Main {
    public static void main(String[] args) {

                // Зарплати працівників за 1 місяць
                int a = 5000;
                int b = 6000;
                int c = 7000;

                // Обчислення суми зарплати за 10 років для кожного працівника
                int sumA = a * 12 * 10;
                int sumB = b * 12 * 10;
                int sumC = c * 12 * 10;

                // Відняття 5% податку
                double taxRate = 0.05;
                double sumAAfterTax = sumA * (1 - taxRate);
                int sumBAfterTax = (int)(sumB * (1 - taxRate));
                int sumCAfterTax = (int)(sumC * (1 - taxRate));

                // Порахувати середнє арифметичне за трьома сумами за 10 років
                int average = (int) ((sumAAfterTax + sumBAfterTax + sumCAfterTax) / 3);

                // Вивести суми зарплат за 10 років з урахуванням вирахування податків та середнє арифметичне
                System.out.println("Сума зарплати працівника A за 10 років: " + sumAAfterTax);
                System.out.println("Сума зарплати працівника B за 10 років: " + sumBAfterTax);
                System.out.println("Сума зарплати працівника C за 10 років: " + sumCAfterTax);
                System.out.println("Середнє арифметичне за трьома сумами за 10 років: " + average);
            }
        }




