package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\IdeaProjects\\JavaMarathon2020\\src\\main\\resources\\shoes.csv");
        File fileToSave = new File("C:\\Users\\user\\IdeaProjects\\JavaMarathon2020\\src\\main\\resources\\missing_shoes.txt");

        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(fileToSave);

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(";");
            if (Integer.parseInt(line[2]) == 0) {
                pw.println(line[0] + ", " + line[1] + ", " + line[2]);
            }
        }

        pw.close();
        scanner.close();
    }
}
