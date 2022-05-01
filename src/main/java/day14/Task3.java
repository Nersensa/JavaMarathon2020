package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(ParseFileToObjList());
    }

    public  static List<Person> ParseFileToObjList() {
        File file = new File("people.txt");
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            List<String> line = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();

                line = List.of(s.split(" "));

                if (Integer.parseInt(line.get(1)) <= 0)
                    throw new IllegalArgumentException();
                
                personList.add(new Person(line.get(0), Integer.parseInt(line.get(1))));
            }
            return personList;
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal input file");
        }
        return null;
    }
}
