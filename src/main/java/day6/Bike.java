package day6;

class Bike {
    private int year;
    private String color;
    private String model;

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yeardifference(int year) {
        return year - this.year;
    }

    public Bike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
        System.out.println(this.model);
    }
}