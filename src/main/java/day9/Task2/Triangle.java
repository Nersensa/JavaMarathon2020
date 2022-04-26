package day9.Task2;

public class Triangle extends Figure{
    private double h;
    private double w;
    private double n;

    public Triangle(String color, double h, double w, double n) {
        super(color);
        this.h = h;
        this.w = w;
        this.n = n;
    }

    @Override
    public double area() {
        double p = (h+w+n)/2.0;
        return Math.sqrt(p*(p-h)*(p-w)*(p-n));
    }

    @Override
    public double perimeter() {
        return h+w+n;
    }
}
