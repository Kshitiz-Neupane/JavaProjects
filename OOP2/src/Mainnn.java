import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        System.out.println("Enter base of the triangle");
        double base = k.nextDouble();

        System.out.println("Enter height of the triangle");
        double height = k.nextDouble();

        Triangle t1 = new Triangle(base, height);

        t1.calculateArea();

    }
}

