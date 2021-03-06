package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane samalet = new Airplane("boing", 2005, 54, 12);
        samalet.info();
        samalet.fillup(50);
        samalet.fillup(50);
        samalet.info();
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    void fillup(int fuel) {
        this.fuel += fuel;
    }

    public int getFuel() {
        return fuel;
    }
}