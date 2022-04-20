package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("boing 747", 2000, 40, 12);
        Airplane airplane2 = new Airplane("wizair 10", 2015, 41, 6);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}