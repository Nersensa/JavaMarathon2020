package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Musicband a = new Musicband("Beatles", 1860);
        Musicband b = new Musicband("Nirvana", 1980);
        a.setMembers(new ArrayList<>());
        List<String> listb = new ArrayList<>();
        listb.add("Jimmy Hendrix");
        listb.add("Slash");
        b.setMembers(listb);
        System.out.println(b.getMembers());
        Musicband.transferMembers(a,b);
        System.out.println(a.getMembers());
        System.out.println(b.getMembers());
    }
}
