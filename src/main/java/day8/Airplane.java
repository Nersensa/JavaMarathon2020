package day8;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    static {
        System.out.println("!");
    }

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

    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }
}