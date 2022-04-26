package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(6);
        list.add("ford");
        list.add("ferrari");
        list.add("lamborghini");
        list.add("porsche");
        list.add("moskvich");

        System.out.println(list);

        list.add(3, "lanos");
        list.remove(0);

        System.out.println(list);
    }
}
