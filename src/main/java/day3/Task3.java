package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        while (count > 0) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0d) {
                System.out.println("Деление на 0");
            }

            if (b != 0d) {
                System.out.println(a / b);
            }
            count -= 1;
        }
    }
}
