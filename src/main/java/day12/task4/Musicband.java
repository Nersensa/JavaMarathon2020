package day12.task4;

import java.util.List;

public class Musicband {
    private  String name;
    private  int year;
    private List<String> members;

    public Musicband(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static void transferMembers(Musicband band1, Musicband band2) {
        for (String element: band2.getMembers()) {
            band1.members.add(element);
            //band2.members.remove(element);
        }
        band2.members.clear();
    }

    public void printMembers() {
        System.out.println(members);
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
