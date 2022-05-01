package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.addAll(List.of(scanner.nextLine().split(" ")));
            }
            for (int i = 0; i < lines.size(); i++) {
                if (i % 2 != 0) {
                    if (Integer.parseInt(lines.get(i)) <= 0) {
                        throw new IllegalArgumentException();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Обнаружен неккоректный возраст");
        }
        return lines;
    }
}
