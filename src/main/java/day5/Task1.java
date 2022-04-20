package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1980);
        car1.setColor("red");
        car1.setModel("pontiac");
        System.out.println(car1.getYear());
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
