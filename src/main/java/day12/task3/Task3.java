
import day12.task3.Musicband;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Musicband> bands = new ArrayList<>();
        bands.add(new Musicband("Beatles", 1860));
        bands.add(new Musicband("q", 1990));


        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }

    public static List<Musicband> groupsAfter2000(List<Musicband> e) {
        List<Musicband> bandsAfter2000 = new ArrayList<>();
        for (Musicband element: e) {
            if (element.getYear() > 2000) {
                bandsAfter2000.add(element);
            }
        }
        return bandsAfter2000;
    }
}
