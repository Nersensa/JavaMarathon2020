package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures){
        double redPerimeter = 0;
        for (Figure element: figures) {
            if (element.getColor() == "Red") {
                redPerimeter += element.perimeter();
            }
        }
        return redPerimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double redArea = 0;
        for (Figure element: figures) {
            if (element.getColor() == "Red") {
                redArea += element.area();
            }
        }
        return redArea;
    }
}
