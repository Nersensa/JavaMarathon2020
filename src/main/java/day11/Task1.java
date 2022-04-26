package day11;

import day10.Courier;
import day10.Picker;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker oleg = new Picker(warehouse1);
        Courier dima = new Courier(warehouse1);

        for (int i = 0; i <= 1500; i++) {
            oleg.doWork();
            dima.doWork();
        }
        System.out.println(warehouse1);
        System.out.println(oleg.getSalary());
        System.out.println(dima.getSalary());
    }
}
