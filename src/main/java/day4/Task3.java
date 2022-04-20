package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        Random random = new Random();
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        System.out.println(Arrays.deepToString(array));

        int indexOfMaxLine = 0;
        int maxLine = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]) + "    Строка: " + i + "   Сумма строки: " + sum);
            if (sum > maxLine) {
                maxLine = sum;
                indexOfMaxLine = i;
            }
        }

        System.out.println(indexOfMaxLine);
    }
}
