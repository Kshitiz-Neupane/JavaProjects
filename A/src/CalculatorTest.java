// Kshitiz Neupane
public class CalculatorTest {
    public static void main(String[] args) {
        // Circle Area
        double radius = 5.0;
        double circleArea;
        circleArea = GeometryCalculator.calculateArea(radius);
        // Rectangle Area
        double length = 10.0;
        double width = 4.0;
        double rectangleArea;
        rectangleArea = GeometryCalculator.calculateArea(length, width);
        // Triangle Area
        double base = 8.0;
        double height = 6.0;
        double triangleArea;
        triangleArea = GeometryCalculator.calculateArea(base, height, "triangle");

        // Display Results
        System.out.println("===== Geometry Calculator =====");

        System.out.println("Area of Circle: " + circleArea);

        System.out.println("Area of Rectangle: " + rectangleArea);

        System.out.println("Area of Triangle: " + triangleArea);
    }
}

