package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2000);
        car1.info();
        System.out.println(car1.yeardifference(2020));
    }
}
