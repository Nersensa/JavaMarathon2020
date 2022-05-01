package day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input first number: ");
        String bigNum1 = scanner.nextLine();

        System.out.println("Please, input second number: ");
        String bigNum2 = scanner.nextLine();

        System.out.println(bigSum(bigNum1, bigNum2));
    }

    public static String bigSum(String bigNum1, String bigNum2) {

        int carry = 0;      // carrying 1 if sum of two digits > 9
        String result;      // resulting string
        int biggestLength;      // Length 0f the biggest number

        if (bigNum1.length() >= bigNum2.length()) {
            biggestLength = bigNum1.length();
        } else {
            biggestLength = bigNum2.length();
        }

        int[] firstNumber = new int[biggestLength];
        int[] secondNumber = new int[biggestLength];

        for (int i = 0; i < bigNum1.length(); i++) {
            firstNumber[i] = Integer.parseInt(String.valueOf(bigNum1.charAt(bigNum1.length() - i -1)));
        }
        System.out.println(Arrays.toString(firstNumber));
        Collections.reverse(Arrays.asList(firstNumber));
        System.out.println(Arrays.toString(firstNumber));

        return null;
    }
}