package day5;

public class Task2 {
    public static void main(String[] args) {
       Bike bike1 = new Bike(1980, "yellow", "Viper");
    }
}

class Bike {
    private int year;
    private String color;
    private String model;

    public Bike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
        System.out.println(this.model);
    }
}