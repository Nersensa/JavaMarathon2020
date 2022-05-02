package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        File file = new File("test.txt");

        printResult(file);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);

            String[] numString = scanner.nextLine().split(" ");

            int sum = 0;
            for (String element: numString) {
                sum += Integer.parseInt(element);
            }

            double serArifm = sum / (double) numString.length;

            System.out.printf(serArifm + "--> %.3f", serArifm);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
