package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int counter = 0;
            int sum = 0;
            for (String element: numbersString) {
                numbers[counter++] = Integer.parseInt(element);
                sum += numbers[counter-1];
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }
}