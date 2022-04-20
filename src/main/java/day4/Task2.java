package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));

        int biggestElement = 0;
        int leastestElement = array[0];
        int mod10 = 0;
        int mod10Sum = 0;
        for (int element: array) {
            if (element > biggestElement) {
                biggestElement = element;
            }
            if (element < leastestElement) {
                leastestElement = element;
            }
            if (element % 10 == 0) {
                mod10++;
                mod10Sum += element;
            }
        }

        System.out.println(biggestElement);
        System.out.println(leastestElement);
        System.out.println(mod10);
        System.out.println(mod10Sum);
    }
}
