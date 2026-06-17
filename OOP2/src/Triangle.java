public class Triangle {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        double area;
        area = (1.0 / 2) * (base * height);

        System.out.println("Area of triangle is " + area);
    }
}