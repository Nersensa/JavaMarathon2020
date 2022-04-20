package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();
        int moreThan8 = 0;
        int even1 = 0;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10);
            sum += array[i];
            if (array[i] > 8) {
                moreThan8 += 1;
            }
            if (array[i] == 1) {
                even1 += 1;
            }
            if (array[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Введено число " + array.length + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThan8);
        System.out.println("Количество чисел равных 1: " + even1);
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Сумма всех элементов массива: " + sum );
    }
}
