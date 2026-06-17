//Kshitiz Neupane
public class GeometryCalculator {
    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        double area;
        area = 3.1416 * radius * radius;
        return area;
    }
    // Method to calculate area of rectangle
    public static double calculateArea(double length, double width) {
        double area;
        area = length * width;
        return area;
    }
    // Method to calculate area of triangle
    public static double calculateArea(double base, double height, String shapeType) {
        double area = 0;
        if (shapeType.equals("triangle")) {
            area = 0.5 * base * height;
        }
        return area;
    }
}







