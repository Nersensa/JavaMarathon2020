package day9.Task2;

public class Rectangle extends Figure{
    private double h;
    private double w;

    public Rectangle(String color, double h, double w) {
        super(color);
        this.h = h;
        this.w = w;
    }

    @Override
    public double area() {
        return h*w;
    }

    @Override
    public double perimeter() {
        return h+w;
    }
}
