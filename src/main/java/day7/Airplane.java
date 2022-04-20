package day7;

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println(airplane1.producer + " > " + airplane2.producer);
        } else {
            System.out.println(airplane1.producer + " < " + airplane2.producer);
        }
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